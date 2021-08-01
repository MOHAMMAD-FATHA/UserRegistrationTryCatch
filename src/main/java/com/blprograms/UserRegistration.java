package com.blprograms;

import  java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstName(String fname) {
        boolean answer = Pattern.matches("[A-Z]+[A-Za-z]{2,}",fname);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid first Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean lastName(String lname) throws InvalidEntryException {
        boolean answer = Pattern.matches("[A-Z]+[A-Za-z]{2,}", lname);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid Last Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean Email(String email) throws InvalidEntryException {
        boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", email);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid Last Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean contactNumber(String ContactNumber) {
        boolean answer = Pattern.matches("91\\s[0-9]{10}", ContactNumber);
        try {
            if (answer) {
                System.out.println("Thank you");
            } else {
                throw new InvalidEntryException("please enter valid Contact Number.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean password1(String password) throws InvalidEntryException {
        // rule1 = minimum 8 characters
        boolean answer = Pattern.matches("[a-zA-Z]{8,}", password);
       try {
           if (answer) {
               System.out.println("Thank you");
               return true;
           }
           else {
               throw new InvalidEntryException("please enter valid password.");
           }
       }
       catch (InvalidEntryException e ){
           System.out.println(e.getMessage());
       }
        return false;
    }
    public boolean password2(String password) throws InvalidEntryException {
        // rule1 = minimum 8 characters and 1 upper case
        boolean answer = Pattern.matches("[A-Z][a-z]{8,}", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid Password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean password3(String password) throws InvalidEntryException {
        // rule1 = minimum 8 characters and 1 upper case
        boolean answer = Pattern.matches("([A-Z]+[a-z]+[0-9]+)", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid Password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean password4(String password) throws InvalidEntryException {
        // rule1 = minimum 8 characters and 1 upper case
        boolean answer = Pattern.matches("([A-Z]+[a-z]+[0-9]){7,}+([!@#$%^&*+-|'~`,<>.?_]){1}", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid Password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean EmailValidation(String email) throws InvalidEntryException {
        boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new InvalidEntryException("please enter valid Last Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }

}
