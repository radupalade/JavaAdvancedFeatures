package ZooLand;

public class Dog extends Animal {

    public Dog(String color) {
        super(color);
    }

    @Override
    public void move() {

        System.out.println("dog bites");
    }
}
