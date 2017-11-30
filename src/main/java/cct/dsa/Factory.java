package cct.dsa;

import org.fluttercode.datafactory.impl.DataFactory;
import java.util.Date;

public class Factory extends User {

    public Factory() {
        super();
        DataFactory df = new DataFactory();
        String[] values = {"Y","N"};
        Date minDate = df.getDate(2000, 1, 1);
        Date maxDate = df.getDate(minDate, 0, 10);
        Date start = df.getDateBetween(minDate, maxDate);
            int userId = UserBuilder.ID_GENERATOR.incrementAndGet();
            String f_name = df.getFirstName();
            String l_name = df.getLastName();
            Date arrival = df.getDate(2000,10,4);
            int p_number = Integer.parseInt(df.getNumberText(9));
            String child = df.getItem(values);
            this.userID=userId;
            this.fname = f_name;
            this.lname = l_name;
            this.arrivalDate = arrival;
            this.passport = p_number;
            this.children = child;
        }
    }



