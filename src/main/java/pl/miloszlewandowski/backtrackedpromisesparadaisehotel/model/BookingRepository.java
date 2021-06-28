package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Booking findBookingByBookingId(Integer id);

}
