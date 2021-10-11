package day_9.Shapes;

public class TestJava {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Triangle("Red", 10, 10, 5),
            new Triangle("Blue", 7, 8, 9),
            new Rectangle("Red", 10, 20),
            new Rectangle("Blue", 2, 5),
            new Circle("Red", 5),
            new Circle("Blue", 3)
        };

        System.out.println("Сумма периметров с красным цветом: " + calculateRedPerimeter(shapes));
        System.out.println("Сумма площадей с красным цветом: " + calculateRedArea(shapes));
    }

    public static double calculateRedPerimeter(Shape[] shapes) {
        double summaPerimeter = 0;
        if (shapes.length != 0) {
            for (Shape shape : shapes) {
                if (shape.getColor().equals("Red")) {
                    summaPerimeter = summaPerimeter + shape.perimeter();
                }
            }
        }
        return summaPerimeter;
    }

    public static double calculateRedArea(Shape[] shapes) {
        double summaArea = 0;
        if (shapes.length != 0) {
            for (Shape shape : shapes) {
                if (shape.getColor().equals("Red")) {
                    summaArea = summaArea + shape.area();
                }
            }
        }
        return summaArea;
    }
}
