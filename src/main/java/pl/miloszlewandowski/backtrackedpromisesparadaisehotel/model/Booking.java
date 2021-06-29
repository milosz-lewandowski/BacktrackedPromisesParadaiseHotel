package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;


import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.BookingInfo;

import javax.persistence.*;

@Entity
@Table(name = "bookings", schema = "PUBLIC")
public class Booking implements BookingInfo {

    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;
    @OneToOne
    private Room room;

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Booking(Guest guest, Room room) {
    }

    public Booking(Integer bookingId, Guest guest, Room room) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
    }

    public Booking() {
    }


    public Integer getBookingId() {
        return bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", guest=" + guest +
                ", room=" + room +
                ", bookingStart=" +
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
