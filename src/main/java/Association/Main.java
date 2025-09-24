package Association;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("st1", "student 1");
        Student student2 = new Student("st2", "student 2");

        Teacher teacher = new Teacher("teacher 1");
        teacher.addStudent(student1);
        teacher.addStudent(student2);
    }
}
