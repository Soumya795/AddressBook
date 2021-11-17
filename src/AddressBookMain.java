import java.util.*;

public class AddressBookMain {
    public ArrayList<AddressBookMain> contact = new ArrayList<AddressBookMain>();
    Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String phNumber;

    //Constructor
    public AddressBookMain(String firstName, String lastName, String address, String city, String state, String pin, String phNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.phNumber = phNumber;
    }

    public void addContact()//Adding person details to Address Book
    {
        System.out.println("Enter contact details:");
        System.out.println("first_name:");
        firstName = sc.next();
        System.out.println("last_name:");
        lastName = sc.next();
        System.out.println("address:");
        address = sc.next();
        System.out.println("city:");
        city = sc.next();
        System.out.println("state:");
        state = sc.next();
        System.out.println("zip:");
        pin = sc.next();
        System.out.println("phone_number:");
        phNumber = sc.next();
    }

    public void editContact()//Edits the details of the contact present in Address Book
    {
        System.out.println("Enter the person whose contact needs to be edited");
        String name = sc.next();
        for (int j = 0; j < contact.size(); j++) {
            AddressBookMain address_book = contact.get(j);
            if (address_book.firstName.equals(name)) {
                System.out.println("Enter first_name:");
                address_book.firstName = sc.next();
                System.out.println("Enter last_name:");
                address_book.lastName = sc.next();
                System.out.println("Enter address:");
                address_book.address = sc.next();
                System.out.println("Enter city:");
                address_book.city = sc.next();
                System.out.println("Enter state:");
                address_book.state = sc.next();
                System.out.println("Enter pin:");
                address_book.pin = sc.next();
                System.out.println("Enter phone_number:");
                address_book.phNumber = sc.next();

            }
        }
    }
}


