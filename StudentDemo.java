class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Alice", 3.8),
            new Student(102, "Bob", 3.5),
            new Student(103, "Charlie", 3.9)
        };

        for (Student student : students) {
            student.displayInfo();
        }

        System.out.println("Total students: " + students.length);
    }
}
