import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Ability to create contact
public class Contact {
    public static void main(String[] args) {
        ArrayList<AddContact> arrayList = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        int counter = 0;
        String insertContacts;//Yes or No
        while (true) {
            System.out.println("Do you want to insert contact details to address (Yes/No)");
            insertContacts = s.next();

            if (insertContacts.equals("Yes")) {
                AddContact a = new AddContact();


                System.out.println("Enter first name ");
                a.setFirstName(s.next());

                System.out.println("Enter last name ");
                a.setLastName(s.next());
                System.out.println("Enter  mail ");
                a.setMail(s.next());
                System.out.println("Enter city name ");
                a.setCity(s.next());
                System.out.println("Enter state name ");
                a.setState(s.next());
                System.out.println("Enter phone number ");
                a.setPhoneNumber(s.nextLong());
                System.out.println("Enter zip code ");
                a.setZip(s.nextInt());

                arrayList.add(counter, a);//(0,a(name,city, state))

            } else if (insertContacts.equals("Exit")) {
                break;

            }
        }
        //displaying details of 1st person
        for (int i = 0; i < arrayList.size(); i++) {            //(index+1)
            System.out.println("------------------Contact " + (i + 1) + "----------------");
            System.out.println(arrayList.get(i).getFirstName());
            System.out.println(arrayList.get(i).getLastName());
            System.out.println(arrayList.get(i).getCity());
            System.out.println(arrayList.get(i).getMail());
            System.out.println(arrayList.get(i).getState());
            System.out.println(arrayList.get(i).getZip());
            System.out.println(arrayList.get(i).getPhoneNumber());

        }
        System.out.println("Do you want to edit contact details ? If yes,type first name of person");

        String editDetails = s.next();
        for (int i = 0; i < arrayList.size(); i++) {
            if (editDetails.equals(arrayList.get(i).getFirstName())) {
                System.out.println("set name");
                arrayList.get(i).setFirstName(s.next());//first get the name then edit/set


            }

        }
        //updated list
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("------------------Contact " + (i + 1) + "----------------");
            System.out.println(arrayList.get(i).getFirstName());
            System.out.println(arrayList.get(i).getLastName());
            System.out.println(arrayList.get(i).getCity());
            System.out.println(arrayList.get(i).getMail());
            System.out.println(arrayList.get(i).getState());
            System.out.println(arrayList.get(i).getZip());
            System.out.println(arrayList.get(i).getPhoneNumber());

        }
        String delete = s.next();
        for (int i = 0; i < arrayList.size(); i++) {
            if (delete.equals(arrayList.get(i).getFirstName())) {

                arrayList.remove(i);

                //first get the name then edit/set


            }

        }
        for (int i = 0; i < arrayList.size(); i++) {            //(index+1)
            System.out.println("------------------Contact " + (i + 1) + "----------------");
            System.out.println(arrayList.get(i).getFirstName());
            System.out.println(arrayList.get(i).getLastName());
            System.out.println(arrayList.get(i).getCity());
            System.out.println(arrayList.get(i).getMail());
            System.out.println(arrayList.get(i).getState());
            System.out.println(arrayList.get(i).getZip());
            System.out.println(arrayList.get(i).getPhoneNumber());


        }


    }
}

    class AddContact {
        private String firstName;
        private String lastName;
        private String mail;
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

        public String setFirstName(String firstName) {
            this.firstName = firstName;
            return firstName;
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

