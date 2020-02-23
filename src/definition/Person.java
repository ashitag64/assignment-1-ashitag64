package definition;

import java.math.BigInteger;
import java.util.ArrayList;

public class Person {

    // these are the fields for the person class
    private String FName;
    private String LName;
    private ArrayList<BigInteger> contactList = new ArrayList<>();
    private String email;

    //getter methods for the fields of person class
    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<BigInteger> getContactList() {
        return contactList;
    }
}
