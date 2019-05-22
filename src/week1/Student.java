package week1;

public class Student extends Person {
    private double grade;

    public Student(Name name, int age, double grade) {

        super(name, age);
        this.grade = grade;

    }

    public double setGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + " grade: " + this.grade + "\n";

    }
}
