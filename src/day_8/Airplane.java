package day_8;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String producer, int year, double length, double weight, double fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }

    public double fillUp(double fuel) {
        return getFuel() + fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if(airplane1.getLength() > airplane2.getLength()) {
            System.out.println(airplane1.producer);
        } else if(airplane1.getLength() < airplane2.getLength()) {
            System.out.println(airplane2.producer);
        } else {
            System.out.println("Одинаковы");
        }
    }
}
