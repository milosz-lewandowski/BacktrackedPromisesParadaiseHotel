package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

public interface BookingInfo {
    Integer getBookingId();

    GuestInfo getGuest() throws GuestIdNotSpecifiedException;

    RoomInfo getRoom() throws RoomIdNotSpecifiedException;

    interface GuestInfo {

        Integer getInfoGuestId() throws GuestIdNotSpecifiedException;

        String getFirstName();
    }

    interface RoomInfo {
        Integer getInfoRoomId() throws RoomIdNotSpecifiedException;
        String getRoomNumber();
    }
}

class GuestIdNotSpecifiedException extends Exception {
    public GuestIdNotSpecifiedException() {
        super("Can't save booking. No guest Id specified");
    }
}

class RoomIdNotSpecifiedException extends Exception {
    public RoomIdNotSpecifiedException() {
        super("Can't save booking. No room Id specified");
    }
}