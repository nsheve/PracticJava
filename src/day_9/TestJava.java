package day_9;

public class TestJava {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Nasty", "Physical");
        Student student = new Student("Nikita", "3530904/80106");

        teacher.printInfo();
        student.printInfo();
    }
}
