package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import javax.persistence.*;

@Entity
@Table(name = "guests")
public class Guest {

    //TODO: consider case

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long GuestId;
    @Column(nullable = false)
    private String FirstName;
    @Column(nullable = false)
    private String Surname;
    @Column(unique = true)
    private String phoneNumber;

    public Guest() {
    }

    public Guest(long guestId, String firstName, String surname, String phoneNumber) {
        GuestId = guestId;
        FirstName = firstName;
        Surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public long getGuestId() {
        return GuestId;
    }

    public void setGuestId(long guestId) {
        GuestId = guestId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "GuestId=" + GuestId +
                ", FirstName='" + FirstName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
