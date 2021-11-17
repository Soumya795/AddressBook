import java.util.*;

public class AddressBookMain {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String phNumber;

    //Constructor
    public AddressBookMain(String firstName, String lastName, String address, String city, String state, String pin, String phNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.phNumber = phNumber;
    }
    public AddressBookMain() {
        System.out.println("Welcome to Address Book Program");//Welcome Message
    }

}
