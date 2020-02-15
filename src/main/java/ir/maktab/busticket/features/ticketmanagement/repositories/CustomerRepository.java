package ir.maktab.busticket.features.ticketmanagement.repositories;

import ir.maktab.busticket.config.database.HibernateUtil;
import ir.maktab.busticket.features.share.repositories.CrudRepository;
import ir.maktab.busticket.features.ticketmanagement.models.Customer;

public class CustomerRepository extends CrudRepository<Customer, Long> {

    private static CustomerRepository customerRepository;

    public CustomerRepository() {
        setSession(HibernateUtil.getSession());
    }

    public static  CustomerRepository getInstance(){
        if (customerRepository == null)
            customerRepository = new CustomerRepository();
        return customerRepository;
    }

    @Override
    protected Class<Customer> getEntityClass() {
        return Customer.class;
    }
}
