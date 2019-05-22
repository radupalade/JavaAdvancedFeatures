package ZooLand;

public class Cat extends Animal {


    public Cat(String color) {
        super(color);
    }

    @Override
    public void move() {

        System.out.println("cat is jumping");

    }
}
