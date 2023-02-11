import java.util.Scanner;

//Ability to create contact
public class Contact {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first name ");
        String firstName=s.next();
        System.out.println("Enter last name ");
        String lastName=s.next();
        System.out.println("Enter  mail ");
        String mail=s.next();
        System.out.println("Enter city name ");
        String city=s.next();
        System.out.println("Enter state name ");
        String state=s.next();
        System.out.println("Enter phone number ");
        long phoneNumber=s.nextInt();
        System.out.println("Enter zip code ");
        int  zip=s.nextInt();


    }

}
class AddContact{
    private String firstName;
    private String lastName;
    private String  mail;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
