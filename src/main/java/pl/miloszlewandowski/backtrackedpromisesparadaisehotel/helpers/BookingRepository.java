package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Booking findBookingByBookingId(Integer id);

}