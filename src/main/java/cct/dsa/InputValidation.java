package cct.dsa;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

    public int checkInputDigits() {//check input symbols are digits
        Scanner sc = new Scanner(System.in);
        Integer pick = null;//create empty object Integer type
        while (pick == null) {//do while object is empty
            try {
                String str = sc.nextLine();//read string from console
                pick = Integer.valueOf(str);//convert string to int
            } catch (Exception e) {
                System.out.println("Only digits allowed!");
            }
        }
        return pick;
    }

    public String checkInputForLetters() throws IOException, ClassNotFoundException {
        //scan string input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Create a Pattern object
        Pattern p = Pattern.compile("[a-zA-Z]+");
        //use to match the regular expression used to create it against different input
        while (!p.matcher(str).matches()) {//while str not (!) match pattern
            System.out.println("Should contain letters only!");
            str = sc.nextLine();
        }
        return str;
    }

    public String checkInputForMatches() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[ynYn]+");
        while (!p.matcher(str).matches()) {
            System.out.println("Should contain y, Y - for YES or n, N - for NO");
            str = sc.nextLine();
        }
        return str;
    }

    public String isThisDateValid() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$");
        while (!p.matcher(str).matches()) {
            System.out.println("not valid date");
            str = sc.nextLine();
        }
        return str;
    }

}


