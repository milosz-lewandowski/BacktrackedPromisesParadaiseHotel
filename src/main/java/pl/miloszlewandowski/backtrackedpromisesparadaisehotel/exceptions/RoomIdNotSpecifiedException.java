package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions;

public class RoomIdNotSpecifiedException extends Exception {
    public RoomIdNotSpecifiedException() {
        super("Can't save booking. No room Id specified");
    }
}
