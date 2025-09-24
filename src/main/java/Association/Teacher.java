package Association;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public String name;
    public List<Student> students;

    public Teacher(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
