package week1;

import java.util.ArrayList;
import java.util.List;

public class SdaGroup {

    private Adress location;
    private List<Student> students;
    private List<Teacher> teachers;

    public SdaGroup(Adress location) {
        this.location = location;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);

    }


    @Override
    public String toString() {
        return location.toString() + "\n" +
                "Students" + students.toString() + "\n" +
                "Teachers" + teachers.toString();
    }


}
