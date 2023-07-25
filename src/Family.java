public class Family implements ServicesAble{
    private int Person;

    public Family(int person) {
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
        System.out.println(78000+":Услуга толойт:");

    }
}
