package ir.maktab.busticket.features.usermanagement.validations;

import ir.maktab.busticket.features.share.enumeration.ExceptionMessage;
import ir.maktab.busticket.features.share.exceptions.UniqueFieldException;
import ir.maktab.busticket.features.share.validations.UniqueStringFieldValidation;
import ir.maktab.busticket.features.usermanagement.models.User;
import ir.maktab.busticket.features.usermanagement.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UniqueUsernameFieldValidation {
    public void validate(User user) throws UniqueFieldException {
        List<String> usernameList = new ArrayList<>();
        UserRepository.getInstance().findAll().forEach(u -> usernameList.add(u.getUsername()));
        new UniqueStringFieldValidation().validate(usernameList, user.getUsername(), ExceptionMessage.UNIQUE_USERNAME.getMessage());
    }
}
