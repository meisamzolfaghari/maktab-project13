package ir.maktab.busticket.features.ticketmanagement.models;

import ir.maktab.busticket.features.share.enumeration.Gender;
import ir.maktab.busticket.features.share.models.PersistenceEntity;
import ir.maktab.busticket.features.usermanagement.models.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Customer extends PersistenceEntity<Long> {

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
    private User user;

    @ManyToMany
    private Set<Ticket> ticketSet = new HashSet<>();

    public Customer() {
    }

    public Customer(String customerName, Gender gender, User user) {
        this.customerName = customerName;
        this.gender = gender;
        this.user = user;
    }

    public Customer(String customerName, Gender gender, User user, Set<Ticket> ticketSet) {
        this.customerName = customerName;
        this.gender = gender;
        this.user = user;
        this.ticketSet = ticketSet;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Ticket> getTicketSet() {
        return ticketSet;
    }

    public void setTicketSet(Set<Ticket> ticketSet) {
        this.ticketSet = ticketSet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", gender=" + gender +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerName, customer.customerName) &&
                gender == customer.gender &&
                Objects.equals(user, customer.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, gender);
    }
}
