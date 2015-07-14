package com.company;

/**
 * Created by gonzal99 on 7/14/2015.
 */
public class Contributor {
    String firstName;
    String lastName;
    public Contributor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
