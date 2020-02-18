package ir.maktab.busticket.features.usermanagement.validations;

import ir.maktab.busticket.features.share.enumeration.ExceptionMessage;
import ir.maktab.busticket.features.share.exceptions.NullableObjectException;
import ir.maktab.busticket.features.share.validations.NullableObjectValidation;
import ir.maktab.busticket.features.usermanagement.models.User;

public class NullableUserFieldsValidation {
    public void validate(User user) throws NullableObjectException {
        new NullableObjectValidation().validate(user.getFirstName() , ExceptionMessage.FIRST_NAME_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getLastName() , ExceptionMessage.LAST_NAME_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getUsername() , ExceptionMessage.USERNAME_REQUIRED.getMessage());
    }
}
