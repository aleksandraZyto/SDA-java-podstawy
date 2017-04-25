package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia12 {
    public static void main(String[] args) {

        Address firstAddress = new Address();
        firstAddress.city = "Leszno";
        firstAddress.postalCode = "64-100";
        firstAddress.street="Irlandzka";
        firstAddress.country = "poland";
        firstAddress.flatNumber = 11;

        User user = new User();
        user.firstName ="Ola";
        user.lastName="Zyto";
        user.age="Age";
        user.phoneNumber="54745546";
        user.address=firstAddress;



    }

}
