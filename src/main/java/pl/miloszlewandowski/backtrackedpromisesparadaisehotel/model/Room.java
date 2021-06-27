package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {

    //TODO: consider case


    @Id
    private long roomId;
    @Column
    private int roomNumber;

    public Room(long roomId, int roomNumber) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
    }

    public Room() {
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
