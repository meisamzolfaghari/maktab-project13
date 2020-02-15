package ir.maktab.busticket.features.ticketmanagement.repositories;

import ir.maktab.busticket.config.database.HibernateUtil;
import ir.maktab.busticket.features.share.repositories.CrudRepository;
import ir.maktab.busticket.features.ticketmanagement.models.Ticket;

public class TicketRepository extends CrudRepository<Ticket, Long> {

    public static TicketRepository ticketRepository;

    public TicketRepository() {
        setSession(HibernateUtil.getSession());
    }

    public static TicketRepository getInstance() {
        if (ticketRepository == null)
            ticketRepository = new TicketRepository();
        return ticketRepository;
    }

    @Override
    protected Class<Ticket> getEntityClass() {
        return Ticket.class;
    }
}
