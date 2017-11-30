package cct.dsa;

import java.util.Date;

public class User {

    int userID;
    String fname;
    String lname;
    Date arrivalDate;
    int passport;
    String children;

    public User() {
    }

    public User(int userID, String fname, String lname, Date arrivalDate, int passport, String children) {
        this.userID = userID;
        this.fname = fname;
        this.lname = lname;
        this.arrivalDate = arrivalDate;
        this.passport = passport;
        this.children = children;
    }

    public int getUserID() {
        return userID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public String getSmallChildren() {
        return children;
    }

    public void setChildren(String Children) {
        this.children = children;
    }

    public String toString() {
        return new StringBuilder().
                append("ID: ").append(String.format("%-5s", userID)).
                append("First name: ").append(String.format("%-10s", fname)).
                append("Last name: ").append(String.format("%-10s", lname)).
                append("Date of arrival: ").append(String.format("%-30s", arrivalDate)).
                append("Passport: ").append(String.format("%-10s", passport)).
                append("Children under 1 year old: ").append(String.format("%-15s", children)).toString();
    }
}