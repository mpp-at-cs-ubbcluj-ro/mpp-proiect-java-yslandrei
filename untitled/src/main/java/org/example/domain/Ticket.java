package org.example.domain;

import java.util.Objects;

public class Ticket extends Entity<Long> {

    private Long concertId;

    private String buyer;

    private int seats;

    public Long getConcertId() {
        return concertId;
    }

    public void setConcertId(Long concertId) {
        this.concertId = concertId;
    }

    public String getBuyer() {
        return buyer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return seats == ticket.seats && Objects.equals(concertId, ticket.concertId) && Objects.equals(buyer, ticket.buyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(concertId, buyer, seats);
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Ticket(Long id, Long concertId, String buyer, int seats) {
        super(id);
        this.concertId = concertId;
        this.buyer = buyer;
        this.seats = seats;
    }
}
