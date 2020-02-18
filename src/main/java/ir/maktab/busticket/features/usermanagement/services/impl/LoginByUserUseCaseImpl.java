package ir.maktab.busticket.features.usermanagement.services.impl;

import ir.maktab.busticket.features.share.enumeration.ExceptionMessage;
import ir.maktab.busticket.features.share.exceptions.NullableListException;
import ir.maktab.busticket.features.share.exceptions.NullableObjectException;
import ir.maktab.busticket.features.share.validations.NullableListValidation;
import ir.maktab.busticket.features.usermanagement.models.User;
import ir.maktab.busticket.features.usermanagement.repositories.UserRepository;
import ir.maktab.busticket.features.usermanagement.services.LoginByUserUseCase;
import ir.maktab.busticket.features.usermanagement.validations.UsernameAndPasswordValidation;

public class LoginByUserUseCaseImpl implements LoginByUserUseCase {

    @Override
    public User login(User user) {
        try {
            new NullableListValidation().validate(UserRepository.getInstance().getUserByUsernameAndPassword(user)
                    , ExceptionMessage.USERNAME_NOT_FOUND.getMessage());
            new UsernameAndPasswordValidation().validate(user);

            return UserRepository.getInstance().getUserByUsernameAndPassword(user).get(0);

        } catch (NullableListException | NullableObjectException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
