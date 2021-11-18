import java.util.*;

public class AddressBookMain {
    public static ArrayList<AddressBookMain> contact = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String phNumber;
    private String email;

    //Constructor
    public AddressBookMain() {
        System.out.println("Welcome to Address Book Program");//Welcome Message
    }


    public AddressBookMain(String first_name, String last_name, String address, String city, String state, String zip, String phone_number, String email) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = zip;
        this.phNumber = phone_number;
        this.email = email;

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
        System.out.println("email:");
        email = sc.next();
        contact.add(new AddressBookMain(firstName, lastName, address, city, state, pin, phNumber, email));
        System.out.println("Added the details\n");
    }

    public void editContact()//Edits the details of the contact present in Address Book
    {
        System.out.println("Enter the person whose contact needs to be edited");
        System.out.println("Enter first Name:");
        String firstName = sc.next();
        System.out.println("Enter Last Name:");
        String lastName = sc.next();
        for (int j = 0; j < contact.size(); j++) {
            AddressBookMain address_book = contact.get(j);
            if (address_book.firstName.equals(firstName) && address_book.lastName.equals(lastName)) {
                System.out.println("Enter first_name:");
                firstName = sc.next();
                System.out.println("Enter last_name:");
                lastName = sc.next();
                System.out.println("Enter address:");
                address = sc.next();
                System.out.println("Enter city:");
                city = sc.next();
                System.out.println("Enter state:");
                state = sc.next();
                System.out.println("Enter zip:");
                pin = sc.next();
                System.out.println("Enter phone_number:");
                phNumber = sc.next();
                System.out.println("Enter email:");
                email = sc.next();
            }

        }
    }

    public void delete()//Method to delete contact
    {
        System.out.println("Enter the person whose contact needs to be deleted");
        System.out.println("Enter first Name:");
        String deleteFirstName = sc.next();
        System.out.println("Enter Last Name:");
        String deleteLastName = sc.next();
        for (int j = 0; j < contact.size(); j++) {
            AddressBookMain address_book = contact.get(j);
            if (address_book.firstName.equals(deleteFirstName) && address_book.lastName.equals(deleteLastName)) {
                contact.remove(address_book);
                System.out.println("Contact is deleted");
            } else {
                System.out.println("Name does not exist");
            }
        }
    }

    public void displayAddressBook()//Method to Display all the contents in AddressBook
    {
        System.out.println("Contacts in this Address Book: ");

        for (int j = 0; j < contact.size(); j++) {
            AddressBookMain object = contact.get(j);
            //Displaying the details
            System.out.println("First Name:" + object.firstName);
            System.out.println("Last Name:" + object.lastName);
            System.out.println("Address:" + object.address);
            System.out.println("City:" + object.city);
            System.out.println("State:" + object.state);
            System.out.println("Zip:" + object.pin);
            System.out.println("Phone Number:" + object.phNumber);
            System.out.println("E mail:" + object.email);
        }
    }
}
