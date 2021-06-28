package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;


import javax.persistence.*;

@Entity
@Table(name = "bookings", schema = "PUBLIC")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingId;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;
    @OneToOne
    private Room room;

    public Booking() {
    }

    public Booking(Integer bookingId, Guest guest, Room room) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
//        this.bookingStart = bookingStart;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
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
}
