package day_6;

public class Motorbike {
    private int yearOfManufacture;
    private String color;
    private String name;

    public Motorbike(int yearOfManufacture, String color, String name) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.name = name;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        System.out.println(getYearOfManufacture() - year);
        return getYearOfManufacture() - year;
    }
}
