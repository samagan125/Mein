public class Hostel implements RentAble{
    private int Person;

    public Hostel(int person) {
        Person = person;
    }

    public int getPerson() {
        return Person;
    }

    public void setPerson(int person) {
        Person = person;
    }

    @Override
    public void Rent() {
        System.out.println(15000+" :Аренда толойт:");
    }
}
