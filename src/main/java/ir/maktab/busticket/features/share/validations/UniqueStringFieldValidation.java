package ir.maktab.busticket.features.share.validations;

import ir.maktab.busticket.features.share.exceptions.UniqueFieldException;

import java.util.List;

public class UniqueStringFieldValidation {
    public void validate(List<String> list , String string , String exceptionMsg) throws UniqueFieldException{
        if (list.stream().anyMatch(s -> s.equals(string)))
            throw new UniqueFieldException(exceptionMsg);
    }
}
