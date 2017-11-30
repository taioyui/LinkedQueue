package cct.dsa;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    Menu menu = new Menu();
    InputValidation validation = new InputValidation();
    UserBuilder userBuilder = new UserBuilder();
    GnibQueue gnibQueue = new GnibQueue(userBuilder, validation);


    public static void main(String args[]) throws ParseException, IOException, ClassNotFoundException {

        Main main = new Main();
        main.dataFactory();
        main.mainMenu();
    }

    public void mainMenu() throws IOException, ClassNotFoundException, ParseException {
        // set pick any value not equals exit choice
        int pick = 0;
        Scanner sc = new Scanner(System.in);
        while (pick != 9) {
            menu.printMainMenu();
            pick = validation.checkInputDigits();
            if (pick == 1) {
                printList();
            } else if (pick == 2) {
                gnibQueue.queue.add(userBuilder.buildNewUser());
            } else if (pick == 3) {
                gnibQueue.addUserFirst();
            } else if (pick == 4) {
                gnibQueue.addUserByIndex();
            } else if (pick == 5) {
                gnibQueue.removeUser();
            } else if (pick == 6) {
                gnibQueue.removeUserById();
            } else if (pick == 7) {
                gnibQueue.findUser();
            } else if (pick == 8) {
                gnibQueue.updateUser();
            } else if (pick == 9) {
                System.out.println("Bye Bye");
                System.exit(0);
            } else {
                System.out.println("Input digits 1-9");
            }
        }
    }


    public void printList() throws IOException {
        int size = gnibQueue.queue.size();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("TODAY IS:" + " " + dateFormat.format(date) + " " + "RECORDS:" + " " + size);
        Scanner scn = new Scanner(System.in);
        if (gnibQueue.queue.size() == 0) {
            System.out.println("QUEUE IS EMPTY");
        } else {
            for (int i = 0; i < gnibQueue.queue.size(); i++) {
                System.out.println("No: " + (i + 1) + " " + gnibQueue.queue.get(i).toString());
            }
            System.out.println("press ENTER for back to MAIN MENU");
            scn.nextLine();//line for input enter (pause before read enter)
        }
    }


    public void dataFactory() {
        for (int i = 0; i < 10; i++) {
            Factory factory = new Factory();
            factory.getUserID();
            factory.getFname();
            factory.getLname();
            factory.getArrivalDate();
            factory.getPassport();
            factory.getSmallChildren();
            gnibQueue.queue.add(factory);
        }
    }
}