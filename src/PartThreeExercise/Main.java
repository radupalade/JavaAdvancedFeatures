package PartThreeExercise;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus() {
            @Override
            public int getSpeed() {
                return super.getSpeed();
            }
        };

        bus.changeGear(1);
        bus.speedUp(3);
        bus.applyBrakes(1);
        bus.printState();

        Truck truck = new Truck() {
            @Override
            public void printState() {
                super.printState();
            }
        };
        truck.changeGear(2);
        truck.speedUp(4);
        truck.applyBrakes(2);
        truck.printState();

    }
}

