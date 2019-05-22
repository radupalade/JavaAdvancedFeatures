package week1;

public class Printer {

    private int i = 0;

    public void printMessage(String message, Integer price) {
        System.out.println("m1: " + message + " m2: " + price);
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public void printPerson(Student s) {
        System.out.println(s.getName() + " " + s.getAge() + " " + s.setGrade());


    }

    public void displayNumbers() {
        int n = 100;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            System.out.println(this.i);

        }
        if (true) {
            i = 0;
        }
        System.out.println(n);
        int i = 0;
        System.out.println(i);
    }
}
