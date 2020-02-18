package ir.maktab.busticket.features.usermanagement.services;

import ir.maktab.busticket.features.usermanagement.models.User;

public interface CreateAccountByUserUseCase {
    User create(User user);
}
