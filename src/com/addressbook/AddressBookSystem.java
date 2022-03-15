package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System Program");
//        AddressBookData contact1 = new AddressBookData();

        Contacts contact1 = new Contacts();
        contact1.addContacts();
        contact1.showContacts();

    }
}

class AddressBookData{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    long phoneNumber;
    String eMail;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipcode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipcode() {
        return zipCode;
    }

    public void setMobileNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getphoneNumber() {
        return phoneNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

}

class Contacts{

    List <AddressBookData> ContactList = new ArrayList<AddressBookData>();
    Scanner in = new Scanner(System.in);

    public void addContacts() {
        AddressBookData addressBookContact = new AddressBookData();

        System.out.println("Enter First Name");
        String firstName = in.next();
        addressBookContact.setFirstName(firstName);

        System.out.println("Enter Last Name");
        String lastName = in.next();
        addressBookContact.setLastName(lastName);

        System.out.println("Enter Address");
        String address = in.next();
        addressBookContact.setAddress(address);

        System.out.println("Enter City Name");
        String city = in.next();
        addressBookContact.setCity(city);

        System.out.println("Enter State Name");
        String state = in.next();
        addressBookContact.setState(state);

        System.out.println("Enter Postal Zip Code");
        int zipCode = in.nextInt();
        addressBookContact.setZipcode(zipCode);

        System.out.println("Enter Mobile Number");
        Long mobileNumber = in.nextLong();
        addressBookContact.setMobileNumber(mobileNumber);

        System.out.println("Enter Email Address");
        String eMail = in.next();
        addressBookContact.seteMail(eMail);

        ContactList.add(addressBookContact); //added all inserted data into Array List
    }

    public void showContacts(){

        if (ContactList.isEmpty()){
            System.out.println("Address Book Is Empty");
            return;
        }

        System.out.println("Address Book Contacts :- ");

        for (AddressBookData i : ContactList){
            System.out.println("First Name Is " + i.getFirstName() + " ");
            System.out.println("Last Name Is " + i.getLastName() + " ");
            System.out.println("Address Is " + i.getAddress() + " ");
            System.out.println("City Is " + i.getCity() + " ");
            System.out.println("State Is " + i.getState() + " ");
            System.out.println("Zip Code Is " + i.getZipcode() + " ");
            System.out.println("Mobile Number Is " + i.getphoneNumber() + " ");
            System.out.println("E-Mail Is " + i.geteMail() + " ");
        }
    }

    }