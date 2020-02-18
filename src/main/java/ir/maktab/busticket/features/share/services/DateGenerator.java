package ir.maktab.busticket.features.share.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGenerator {
    public Date generate(String dateString) {
        Date date = null;

        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        return date;
    }
}
