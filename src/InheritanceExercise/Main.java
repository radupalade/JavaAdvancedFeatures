package InheritanceExercise;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(6, 6, "no");


        System.out.println(animal.getAge());
        System.out.println(animal.getNumberOfLegs());
        System.out.println(animal.getVegetarian());

        Dog dog = new Dog(4, 4, "no", "white");

        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
        System.out.println(dog.getNumberOfLegs());
        System.out.println(dog.getVegetarian());

        Animal animal2 = new Dog(4, 4, "y", "white");
        dog.bark();

        animal2.eat();
    }


}
