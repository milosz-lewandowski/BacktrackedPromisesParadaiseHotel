package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    //TODO: consider case

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long BookingId;
    @ManyToOne
    @JoinColumn(name = "GuestId")
    private Guest guest;
    @OneToOne
    private Room room;
    //    @Column
    //    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //    private LocalDateTime bookingStart;


    public Booking() {
    }

    public Booking(long bookingId, Guest guest, Room room) {
        BookingId = bookingId;
        this.guest = guest;
        this.room = room;
    }

    public long getBookingId() {
        return BookingId;
    }

    public void setBookingId(long bookingId) {
        BookingId = bookingId;
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
                "BookingId=" + BookingId +
                ", guest=" + guest +
                ", room=" + room +
                '}';
    }
}
