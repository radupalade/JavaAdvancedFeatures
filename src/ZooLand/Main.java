package ZooLand;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("black");
        cat.move();
        cat.concreteMethod();

        Dog dog = new Dog("white");
        dog.move();
        dog.concreteMethod();
    }
}
