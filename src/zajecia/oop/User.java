package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class User {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public Address address;
    public String age;

    public void display(){
        System.out.println(firstName+" "+lastName+" "+age);
        System.out.println("phone number "+phoneNumber);
        System.out.println("Address "+address);
    }



}
