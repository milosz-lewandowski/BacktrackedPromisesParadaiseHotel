package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.BookingInfo;

import javax.persistence.*;

@Entity
@Table(name = "rooms", schema = "PUBLIC")
public class Room implements BookingInfo.RoomInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer roomId;
    private String roomNumber;

    public Room() {
    }

    public Room(Integer roomId, String roomNumber) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
