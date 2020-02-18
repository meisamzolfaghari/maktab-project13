package ir.maktab.busticket.features.usermanagement.validations;

import ir.maktab.busticket.features.share.enumeration.ExceptionMessage;
import ir.maktab.busticket.features.share.exceptions.NullableObjectException;
import ir.maktab.busticket.features.share.validations.NullableObjectValidation;
import ir.maktab.busticket.features.usermanagement.repositories.UserRepository;

public class UserIdValidation {
    public void validate(Long id) throws NullableObjectException {
        new NullableObjectValidation().validate(UserRepository.getInstance().findById(id)
                , ExceptionMessage.ID_NOT_EXIST.getMessage());
    }
}
