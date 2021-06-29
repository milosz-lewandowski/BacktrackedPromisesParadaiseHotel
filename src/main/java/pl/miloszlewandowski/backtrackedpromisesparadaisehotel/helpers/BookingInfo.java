package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers;

import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions.GuestIdNotSpecifiedException;
import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions.RoomIdNotSpecifiedException;

public interface BookingInfo {
    Integer getBookingId();

    GuestInfo getGuest() throws GuestIdNotSpecifiedException;

    RoomInfo getRoom() throws RoomIdNotSpecifiedException;

    interface GuestInfo {

        Integer getGuestId() throws GuestIdNotSpecifiedException;

        String getFirstName();
    }

    interface RoomInfo {
        Integer getRoomId() throws RoomIdNotSpecifiedException;

        String getRoomNumber();
    }
}