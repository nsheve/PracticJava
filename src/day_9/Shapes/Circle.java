package day_9.Shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
