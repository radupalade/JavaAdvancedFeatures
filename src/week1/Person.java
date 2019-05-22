package week1;

public class Person {
    public static int count;
    private Name name;
    private int age;

    public Person() {

    }

    public Person(Name name, int age) {
        this.validateAge(age);
        this.name = name;
        this.age = age;
        count++;

    }

    public Person(int age) {
        this.age = age;
        count++;


    }

    public Person(Name name) {
        this.name = name;
        count++;

    }

    public Name getName() {
        return name;

    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.validateAge(age);
        this.age = age;
    }

    private void validateAge(int age) {
        if (age <= 0) {
            System.out.println("Age is not valid");
        }
    }

    @Override
    public String toString() {
        return name.toString() + " age: " + this.getAge();

    }


}
