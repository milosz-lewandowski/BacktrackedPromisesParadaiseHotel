package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.exceptions;

public class GuestIdNotSpecifiedException extends Exception {
    public GuestIdNotSpecifiedException() {
        super("Can't save booking. No guest Id specified");
    }
}
