package ir.maktab.busticket.features.share.validations;

import ir.maktab.busticket.features.share.exceptions.StringLengthException;

public class StringLengthValidation {
    public void validate(String value, Integer defaultLength , String exceptionMsg) throws StringLengthException{
        if (value != null && value.length() > defaultLength)
            throw new StringLengthException(exceptionMsg);
    }
}
