package ir.maktab.busticket.features.share.validations;

import ir.maktab.busticket.features.share.exceptions.EqualsTwoObjectsException;

public class EqualsTwoObjectsValidation {
    public void validate(Object one, Object two, String exceptionMsg) throws EqualsTwoObjectsException{
        if (!one.equals(two))
            throw new EqualsTwoObjectsException(exceptionMsg);
    }
}
