package ZooLand;

public abstract class Animal {

    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public abstract void move();

    public void concreteMethod() {
        System.out.println("hello from animal concrete method");
    }
}

