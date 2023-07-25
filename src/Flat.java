public class Flat implements ServicesAble{
    private int Person;

    public Flat(int person) {
        Person = person;
    }

    public int getPerson() {
        return Person;
    }

    public void setPerson(int person) {
        Person = person;
    }

    @Override
    public void Services() {
        System.out.println(25000+":Услуга толойт:");

    }
}
