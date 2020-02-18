package ir.maktab.busticket.features.usermanagement.validations;

import ir.maktab.busticket.features.share.enumeration.ExceptionMessage;
import ir.maktab.busticket.features.share.exceptions.NullableObjectException;
import ir.maktab.busticket.features.share.exceptions.UniqueFieldException;
import ir.maktab.busticket.features.share.validations.NullableObjectValidation;
import ir.maktab.busticket.features.share.validations.UniqueStringFieldValidation;
import ir.maktab.busticket.features.usermanagement.models.User;
import ir.maktab.busticket.features.usermanagement.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UsernameAndPasswordValidation {
    public void validate(User user) throws NullableObjectException {
        new NullableObjectValidation().validate(user.getUsername(), ExceptionMessage.USERNAME_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getPassword() , ExceptionMessage.PASSWORD_REQUIRED.getMessage());
        new NullableObjectValidation().validate(
                UserRepository.getInstance().getUserByUsernameAndPassword(user).get(0),
                ExceptionMessage.USERNAME_OR_PASSWORD_INCORRECT.getMessage()
        );
    }
}
