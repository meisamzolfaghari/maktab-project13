package ir.maktab.busticket.features.usermanagement.validations;

import ir.maktab.busticket.features.share.enumeration.ExceptionMessage;
import ir.maktab.busticket.features.share.enumeration.LengthFieldValue;
import ir.maktab.busticket.features.share.exceptions.StringLengthException;
import ir.maktab.busticket.features.share.validations.StringLengthValidation;
import ir.maktab.busticket.features.usermanagement.models.User;

public class LengthUserFieldsValidation {
    public void validate(User user) throws StringLengthException {
        new StringLengthValidation().validate(user.getFirstName(), LengthFieldValue.FIRST_NAME.getLength(), ExceptionMessage.FIRST_NAME_LARGER.getMessage());
        new StringLengthValidation().validate(user.getFirstName(), LengthFieldValue.LAST_NAME.getLength(), ExceptionMessage.LAST_NAME_LARGER.getMessage());
        new StringLengthValidation().validate(user.getFirstName(), LengthFieldValue.USERNAME.getLength(), ExceptionMessage.USERNAME_LARGER.getMessage());
    }
}
