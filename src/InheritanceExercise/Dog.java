package InheritanceExercise;

public class Dog extends Animal {

    public String color;

    public Dog(int age, int numberOfLegs, String vegetarian, String color) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("dog barks");
    }

    @Override
    public String toString(){
        return super.toString() + color;
    }






}
