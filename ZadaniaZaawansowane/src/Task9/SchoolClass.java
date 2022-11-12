package Task9;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Student> students = new ArrayList<>();

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public SchoolClass() {
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
