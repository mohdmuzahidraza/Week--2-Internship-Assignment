class Student {
    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class StudentClassImplementation {
    public static void main(String[] args) {
        Student s1 = new Student("Muzahid", 101, "B.Tech");
        s1.displayInfo();
    }
}
