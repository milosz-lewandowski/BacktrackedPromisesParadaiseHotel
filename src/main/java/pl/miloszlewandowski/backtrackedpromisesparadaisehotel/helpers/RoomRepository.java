package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}