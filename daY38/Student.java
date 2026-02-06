class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

abstract class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    abstract void joinCourse(Student student);
}

class JavaCourse extends Course {

    public JavaCourse() {
        super("Java");
    }

    void joinCourse(Student student) {
        System.out.println(student.getName() + " joined " + courseName + " course");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(1, "Ravi");
        JavaCourse jc = new JavaCourse();
        jc.joinCourse(s);
    }
}
