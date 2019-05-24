package PartFourExercise;

public class Main {
    public static void main(String[] args) {

        Walker walker = new Walker() {
            @Override
            public void walk() {
                super.walk();
            }
        };
        walker.breath();
        walker.walk();

        Swimmer swimmer = new Swimmer() {
            @Override
            public void swim() {
                super.swim();
            }
        };
        swimmer.breath();
        swimmer.swim();
    }
}
