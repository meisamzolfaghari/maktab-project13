package ir.maktab.busticket.config.database;

import ir.maktab.busticket.features.ticketmanagement.models.Customer;
import ir.maktab.busticket.features.ticketmanagement.models.Ticket;
import ir.maktab.busticket.features.usermanagement.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session session;

    static {
        SessionFactory firstSessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        session = firstSessionFactory.openSession();
    }

    public static Session getSession() {
        return session;
    }

}
