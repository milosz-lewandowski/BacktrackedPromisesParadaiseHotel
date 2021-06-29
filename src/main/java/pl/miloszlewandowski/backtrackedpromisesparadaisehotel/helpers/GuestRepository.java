package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer> {

}