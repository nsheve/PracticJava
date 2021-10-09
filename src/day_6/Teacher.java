package day_6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int ball = random.nextInt(5);

        System.out.println("Преподаватель " + getName() + " оценил студента именем " + student.getName() + " по предмету " + getObject() + " на оценку " + caseBall(ball));
    }

    public String caseBall(int ball) {
        String valuation = null;
        switch (ball) {
            case 0 :
            case 1 :
                return valuation = "Позор";
            case 2 :
                return valuation = "неудовлетворительно";
            case 3 :
                return valuation = "удовлетворительно";
            case 4 :
                return valuation = "хорошо";
            case 5 :
                return valuation = "отлично";
        }
        return valuation;
    }
}
