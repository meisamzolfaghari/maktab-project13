package ir.maktab.busticket.features.share.validations;

import ir.maktab.busticket.features.share.exceptions.NullableListException;

import java.util.List;

public class NullableListValidation {
    public void validate(List list, String exceptionMsg) throws NullableListException {
        if (list == null)
            throw new NullableListException(exceptionMsg);
    }
}
