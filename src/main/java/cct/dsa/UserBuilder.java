package cct.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class UserBuilder {

    public static final AtomicInteger ID_GENERATOR = new AtomicInteger(101);

    public User buildNewUser() throws IOException, ClassNotFoundException, ParseException {

        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");

        // 31/3/15 2:37 PM
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputValidation validation = new InputValidation();

        System.out.println("Please enter a first name: ");
        String fname = validation.checkInputForLetters();

        System.out.println("Please enter a last name: ");
        String lname = validation.checkInputForLetters();

        System.out.println("Please enter date of arrival in format");
        Date arrivalDate = date.parse(validation.isThisDateValid());

        System.out.println("Please enter a passport number (9 digits): ");
        int passport = validation.checkInputDigits();

        System.out.println("Children under 1 year old: Y/N");
        String children = validation.checkInputForMatches();

        return new User(ID_GENERATOR.incrementAndGet(), fname, lname, arrivalDate, passport, children);
    }
}
