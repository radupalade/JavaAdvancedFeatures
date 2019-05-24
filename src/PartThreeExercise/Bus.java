package PartThreeExercise;

public abstract class Bus extends Vehicle {

    @Override
    public void printState() {
        System.out.println("Bus state: " + "gear: " + getGear() + "/ speed: " + getSpeed());
    }

}
