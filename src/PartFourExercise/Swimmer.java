package PartFourExercise;

public abstract class Swimmer implements Swim, Breath {

    @Override
    public void breath() {
        System.out.println("Swimmer breathes");
    }

    @Override
    public void swim() {
        System.out.println("Swimmer swims");
    }
}
