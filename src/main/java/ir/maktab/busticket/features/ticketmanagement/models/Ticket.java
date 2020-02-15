package ir.maktab.busticket.features.ticketmanagement.models;

import ir.maktab.busticket.features.share.models.PersistenceEntity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ticket extends PersistenceEntity<Long> {

    @Column(name = "ORIGIN")
    private String origin;

    @Column(name = "DESTINATION")
    private String destination;

    @Column(name = "DEPARTURE_DATE")
    @Temporal(TemporalType.DATE)
    private Date departureDate;

    @Column(name = "DEPARTURE_TIME")
    @Temporal(TemporalType.TIME)
    private Date departureTime;

    @Column(name = "TRAVEL_ID")
    private String travelId;

    @ManyToMany(mappedBy = "ticketSet")
    private Set<Customer> customerSet =new HashSet<>();

    public Ticket() {
    }

    public Ticket(String origin, String destination, Date departureDate, Date departureTime, String travelId) {
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.travelId = travelId;
    }

    public Ticket(String origin, String destination, Date departureDate, Date departureTime, String travelId, Set<Customer> customerSet) {
        this(origin,destination,departureDate,departureTime,travelId);
        this.customerSet = customerSet;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", departureTime=" + departureTime +
                ", travelId='" + travelId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(origin, ticket.origin) &&
                Objects.equals(destination, ticket.destination) &&
                Objects.equals(departureDate, ticket.departureDate) &&
                Objects.equals(departureTime, ticket.departureTime) &&
                Objects.equals(travelId, ticket.travelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination, travelId);
    }
}
