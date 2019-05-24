package PartFourExercise;

public abstract class Walker implements Walk, Breath {

    @Override
    public void breath() {
        System.out.println("Walker breathes");
    }

    @Override
    public void walk() {
        System.out.println("Walker walks");
    }
}
