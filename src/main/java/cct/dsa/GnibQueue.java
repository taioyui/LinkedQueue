package cct.dsa;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class GnibQueue {

    java.util.LinkedList<User> queue = new java.util.LinkedList();
    UserBuilder userBuilder;
    InputValidation validation;

    public GnibQueue(UserBuilder userBuilder, InputValidation validation) {
        this.userBuilder = userBuilder;
        this.validation=validation;
    }


    public void updateUser() throws ParseException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("REMOVE USER FROM THE QUEUE: Input ID");
        int userId = validation.checkInputDigits();
        for (int i = 0; i < queue.size(); i++) {
            if (userId == queue.get(i).getUserID()) {
                queue.set(i, userBuilder.buildNewUser());
            }
        }
    }

    public void removeUser() throws ParseException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("REMOVE USER: Input number of records to remove");
        int n = validation.checkInputDigits();
        for (int i = 0; i < n; i++) {
            queue.remove(queue.size() - 1);
        }
    }

    public void removeUserById() throws ParseException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("REMOVE USER FROM THE QUEUE: Input ID");
        int userId = validation.checkInputDigits();
        for (int i = 0; i < queue.size(); i++) {
            if (userId == queue.get(i).getUserID()) {
                queue.remove(i);
            }
        }
    }

    public void addUserByIndex() throws ParseException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ADD USER: Input position number");
        int userId = validation.checkInputDigits();
        queue.add(userId, userBuilder.buildNewUser());
    }

    public void addUserFirst() throws ParseException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        queue.addFirst(userBuilder.buildNewUser());
    }


    public void findUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id");
        int userId = validation.checkInputDigits();
        for (int i = 0; i < queue.size(); i++) {
            if (userId == queue.get(i).getUserID()) {
                System.out.println(i + "" + queue.get(i + 1).fname);

            }
        }

    }


}






