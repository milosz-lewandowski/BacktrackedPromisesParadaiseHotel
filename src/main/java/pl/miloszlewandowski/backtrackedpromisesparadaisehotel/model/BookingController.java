package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BookingController {

    final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @GetMapping("/bookings")
    ResponseEntity bookings(){
        HashMap map = new HashMap();
        List<Booking> bookings = new ArrayList<>();
        if (bookings.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            map.put("String", bookings);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }

}
