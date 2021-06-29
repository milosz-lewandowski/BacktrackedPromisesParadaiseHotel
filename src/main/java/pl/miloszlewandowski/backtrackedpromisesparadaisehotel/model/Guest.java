package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import pl.miloszlewandowski.backtrackedpromisesparadaisehotel.helpers.BookingInfo;

import javax.persistence.*;

@Entity
@Table(name = "guests", schema = "PUBLIC")
public class Guest implements BookingInfo.GuestInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer guestId;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Guest() {
    }

    public Guest(Integer guestId, String firstName, String lastName, String phoneNumber) {
        this.guestId = guestId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
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
                "guestId=" + guestId +
                ", firstName='" + firstName + '\'' +
                ", surname='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
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
