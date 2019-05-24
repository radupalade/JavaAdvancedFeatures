package PartThreeExercise;

public abstract class Truck extends Vehicle {

    @Override
    public void printState() {
        System.out.println("Truck state: " + getGear() + "/ speed: " + getSpeed());

    }
}
