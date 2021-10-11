package day_9;

public class Student extends Human {

    private String nameGroup;

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент - " + getName());
    }
}
