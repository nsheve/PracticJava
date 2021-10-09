package day_6;

public class Car {
    private int yearOfManufacture;
    private String color;
    private String name;

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        System.out.println(getYearOfManufacture() - year);
        return getYearOfManufacture() - year;
    }
}
