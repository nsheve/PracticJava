package day_9.Shapes;

public class Rectangle extends Shape {
    private int height;
    private int weight;

    public Rectangle(String color, int height, int weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double area() {
        return height * weight;
    }

    @Override
    public double perimeter() {
        return (height * 2) + (weight * 2);
    }
}
