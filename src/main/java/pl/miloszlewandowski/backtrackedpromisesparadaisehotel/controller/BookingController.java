package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions.GuestIdNotSpecifiedException;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions.RoomIdNotSpecifiedException;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.BookingRepository;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.GuestRepository;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.RoomRepository;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model.Booking;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model.BookingAccessHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.ALL_VALUE})
public class BookingController {

    final BookingRepository bookingRepository;
    final GuestRepository guestRepository;
    final RoomRepository roomRepository;

    public BookingController(BookingRepository bookingRepository, GuestRepository guestRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.guestRepository = guestRepository;
        this.roomRepository = roomRepository;
    }

    @GetMapping("/bookings")
    ResponseEntity getBookings() {
        Map map = new HashMap();
        List<Booking> bookings = bookingRepository.findAll();
        if (bookings.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            map.put("Bookings:", bookings);
            return ResponseEntity.ok(map);
        }
    }

    @GetMapping("bookings/{id}")
    ResponseEntity getBooking(@PathVariable("id") Integer id) {
        Booking booking = bookingRepository.findBookingByBookingId(id);
        return ResponseEntity.ok(booking);
    }

    @RequestMapping(value = "/bookings", method = RequestMethod.POST)
    ResponseEntity saveBooking(@RequestBody BookingAccessHelper input)
            throws GuestIdNotSpecifiedException, RoomIdNotSpecifiedException {

        Booking toSaveBooking = new Booking();
        toSaveBooking.setGuest(guestRepository.getById(input.getGuestId()));
        toSaveBooking.setRoom(roomRepository.getById(input.getRoomId()));

        Booking savedBooking = bookingRepository.saveAndFlush(toSaveBooking);
        return ResponseEntity.ok("Your reservation is booked with number " + savedBooking.getBookingId());
    }
}