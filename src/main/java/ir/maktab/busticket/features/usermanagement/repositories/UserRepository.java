package ir.maktab.busticket.features.usermanagement.repositories;

import ir.maktab.busticket.config.database.HibernateUtil;
import ir.maktab.busticket.features.share.repositories.CrudRepository;
import ir.maktab.busticket.features.usermanagement.models.User;

public class UserRepository extends CrudRepository<User, Long> {

    private static UserRepository userRepository;

    public UserRepository() {
        setSession(HibernateUtil.getSession());
    }

    public static UserRepository getInstance() {
        if (userRepository == null)
            userRepository = new UserRepository();
        return userRepository;
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
