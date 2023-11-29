// Abstract class representing a person
abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}
