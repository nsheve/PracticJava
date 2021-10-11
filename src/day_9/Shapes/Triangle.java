package day_9.Shapes;

public class Triangle extends Shape {
    private int A_b;
    private int B_c;
    private int C_a;

    public Triangle(String color, int a_b, int b_c, int c_a) {
        super(color);
        A_b = a_b;
        B_c = b_c;
        C_a = c_a;
    }

    @Override
    public double area() {
        double c = Math.sqrt(Math.pow(A_b, 2) - Math.pow(B_c / 2, 2));
        return 1/2 * B_c * c;
    }

    @Override
    public double perimeter() {
        return A_b + B_c + C_a;
    }
}
