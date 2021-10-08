package day_3;

import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {
        task1();
        task2();
    }

    // 1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
    // Программа должна работать до тех пор, пока не будет введено слово “Stop”.
    // Москва, Владивосток, Ростов - Россия
    // Рим, Милан, Турин - Италия
    // Ливерпуль, Манчестер, Лондон - Англия
    // Берлин, Мюнхен, Кёльн - Германия
    static void task1() {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        while (true) {
        if (city.equals("Stop"))
            break;

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
            }
        }
    }

    // 2. Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
    // Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
    // Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
    //(для этих вещественных чисел необходимо использовать тип double и
    // метод nextDouble() у Scanner а соответственно).
    static void task2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double numberOne = sc.nextDouble();
            double numberTwo = sc.nextDouble();

            if (numberTwo == 0)
                break;
            System.out.println(numberOne / numberTwo);
        }
    }
}
