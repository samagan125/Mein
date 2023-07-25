import java.security.Provider;

public class Main {
    public static void main(String[] args) {

     Hostel hostel = new Hostel(4);
        System.out.println(hostel.getPerson()+  "[ Адам жашайт]");
        hostel.Rent();


     Hotel hotel = new Hotel(3);
        System.out.println(hotel.getPerson()+  "[Адам жашайт]");
        hotel.Rent();


     Flat flat = new Flat(7);
        System.out.println(flat.getPerson()+  "[Адам жашайт]");
        flat.Services();


        Family family = new Family(2);
        System.out.println(family.getPerson()+"[Адам жашайт] ");
        family.Services();
    }
}