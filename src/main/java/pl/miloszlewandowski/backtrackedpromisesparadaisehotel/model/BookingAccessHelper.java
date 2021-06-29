package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions.GuestIdNotSpecifiedException;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions.RoomIdNotSpecifiedException;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.BookingInfo;

public class BookingAccessHelper implements BookingInfo, BookingInfo.GuestInfo, BookingInfo.RoomInfo {

    private Guest guest;
    private Room room;
    private Integer roomId;
    private Integer guestId;
    private Integer bookingId;

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public void setRoomId(Integer roomId) {
    }

    public BookingAccessHelper() {
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    @Override
    public Integer getBookingId() {
        return bookingId;
    }

    @Override
    public GuestInfo getGuest() throws GuestIdNotSpecifiedException {
        return guest;
    }

    @Override
    public RoomInfo getRoom() throws RoomIdNotSpecifiedException {
        return room;
    }

    @Override
    public Integer getRoomId() throws RoomIdNotSpecifiedException {
        return room.getRoomId();
    }

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public Integer getGuestId() throws GuestIdNotSpecifiedException {
        return guest.getGuestId();
    }

    @Override
    public String getFirstName() {
        return null;
    }
}
