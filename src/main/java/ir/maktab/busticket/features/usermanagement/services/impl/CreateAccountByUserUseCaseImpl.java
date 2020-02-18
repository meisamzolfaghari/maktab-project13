package ir.maktab.busticket.features.usermanagement.services.impl;

import ir.maktab.busticket.features.share.exceptions.NullableObjectException;
import ir.maktab.busticket.features.share.exceptions.StringLengthException;
import ir.maktab.busticket.features.share.exceptions.UniqueFieldException;
import ir.maktab.busticket.features.usermanagement.models.User;
import ir.maktab.busticket.features.usermanagement.repositories.UserRepository;
import ir.maktab.busticket.features.usermanagement.services.CreateAccountByUserUseCase;
import ir.maktab.busticket.features.usermanagement.validations.LengthUserFieldsValidation;
import ir.maktab.busticket.features.usermanagement.validations.NullableUserFieldsValidation;
import ir.maktab.busticket.features.usermanagement.validations.UniqueUsernameFieldValidation;

public class CreateAccountByUserUseCaseImpl implements CreateAccountByUserUseCase {
    @Override
    public User create(User user) {
        try {
            new NullableUserFieldsValidation().validate(user);
            new UniqueUsernameFieldValidation().validate(user);
            new LengthUserFieldsValidation().validate(user);
            return UserRepository.getInstance().save(user);
        } catch (NullableObjectException | UniqueFieldException | StringLengthException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
