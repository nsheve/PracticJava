package day_5;

// 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
// задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
// Созданный вами класс должен отвечать принципам инкапсуляции.

//2. Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
// Придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Геттером получить год выпуска, цвет, модель, вывести значения в консоль.

public class TestJava {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufacture(2000);
        car.setColor("Black");
        car.setName("BMV");

        System.out.println("Год выпуска автомобиля: " + car.getYearOfManufacture());
        System.out.println("Цвет автомобиля: " + car.getColor());
        System.out.println("Марка автомобиля: " + car.getName());

        Motorbike motorbike = new Motorbike(2005, "White", "Mercedes");

        System.out.println("Год выпуска мотоцикла: " + motorbike.getYearOfManufacture());
        System.out.println("Цвет мотоцикла: " + motorbike.getColor());
        System.out.println("Марка мотоцикла: " + motorbike.getName());
    }
}
