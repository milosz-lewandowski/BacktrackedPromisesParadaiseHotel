package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Guest, Long> {

}
