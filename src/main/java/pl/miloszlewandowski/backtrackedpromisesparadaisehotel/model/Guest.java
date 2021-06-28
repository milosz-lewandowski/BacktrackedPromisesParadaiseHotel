package pl.miloszlewandowski.backtrackedpromisesparadaisehotel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "guests", schema = "PUBLIC")
public class Guest implements BookingInfo.GuestInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer guestId;
    private String firstName;
    private String surname;
    private String phoneNumber;

    public Guest() {
    }

    public Guest(Integer guestId, String firstName, String surname, String phoneNumber) {
        this.guestId = guestId;
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Integer getInfoGuestId() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
                ", surname='" + surname + '\'' +
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
