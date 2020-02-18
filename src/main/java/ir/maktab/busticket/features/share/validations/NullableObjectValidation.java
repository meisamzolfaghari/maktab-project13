package ir.maktab.busticket.features.share.validations;

import ir.maktab.busticket.features.share.exceptions.NullableObjectException;

public class NullableObjectValidation {
    public void validate(Object object , String exceptionMsg) throws NullableObjectException {
        if (object == null)
            throw new NullableObjectException();
        if (object instanceof String)
            if (object.toString().isEmpty())
                throw new NullableObjectException();
    }
}
