package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class Address {

    public String city;
    public String street;
    public int flatNumber;
    public String postalCode;
    public String country;

    public void display(){
        System.out.println(postalCode+" "+city+", "+country);
        System.out.println(street+" "+flatNumber);
    }
}
