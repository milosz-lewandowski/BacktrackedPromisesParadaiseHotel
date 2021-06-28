package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(consumes = { MediaType.APPLICATION_JSON_VALUE,
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
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }

    @GetMapping("bookings/{id}")
    ResponseEntity getBooking(@PathVariable("id") Integer id) {
        Booking booking = bookingRepository.findBookingByBookingId(id);
        return ResponseEntity.ok(booking);
    }

    @RequestMapping(value = "/bookings", method = RequestMethod.POST)
    ResponseEntity saveBooking(@RequestBody Booking input)
    throws GuestIdNotSpecifiedException, RoomIdNotSpecifiedException {
        Booking newBooking = new Booking();
        newBooking.setGuest(
                guestRepository.getById(
                        input.getGuest().getInfoGuestId()));
        newBooking.setRoom(
                roomRepository.getById(
                        input.getRoom().getInfoRoomId()));
        Booking savedBooking = bookingRepository.saveAndFlush(newBooking);
        return ResponseEntity.ok(savedBooking);
    }
    //wrong data
    //no such guest
    //no such room
    //no such
//    @PostMapping("/bookings")
//    ResponseEntity saveBooking(@RequestBody Booking input)
//            throws GuestIdNotSpecifiedException,
//            RoomIdNotSpecifiedException
//    {
//        Booking newBooking = new Booking();
//            newBooking.setGuest(
//                    guestRepository.getById(
//                            input.getGuest().getGuestId()));

//        }
//        return ResponseEntity.unprocessableEntity().body("n");


//        newBooking.setRoom(
//                roomRepository.getById(
//                        input.getRoom().getRoomId()));
//        Booking savedBooking = bookingRepository.saveAndFlush(newBooking);
//        return ResponseEntity.ok(savedBooking);


//        guestInfo.getGuestId();
//        BookingInfo bookingInfo = new Booking()
//        try {
//            Booking toSaveBooking = bookingRepository.save(new Booking(
//                    booking.getGuest(), booking.getRoom()));
//            return new ResponseEntity<>(toSaveBooking, HttpStatus.CREATED);
//        } catch (
//                Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
}


