package day_2;

import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
    }

    // 1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
    // соответствующее количеству этажей в здании.
    // Используя условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
    //Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Средне этажный дом”, 9 и более - “Многоэтажный дом”.
    // Так же, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
    static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во этажей (целое число): ");
        int numberStorey = -1;
        if ((!sc.hasNextInt())) {
            System.out.println("Error");
        } else {
            numberStorey = sc.nextInt();
            if (numberStorey < 0) {
                System.out.println("Error");
            }
        }

        if ((numberStorey > 0) && (numberStorey < 5) ) {
            System.out.println("Малоэтажный дом");
        } else if ((numberStorey > 4) && (numberStorey < 9)) {
            System.out.println("Средне этажный дом");
        } else if (numberStorey > 9) {
            System.out.println("Многоэтажный дом");
        } else if (numberStorey == 0){
            System.out.println("Не бывает домов с 0 этажей!!!");
        }
    }

    // 2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
    // Используя цикл for, вывести все числа из диапазона между a и b,
    // которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.
    //Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка),
    // но число 20 не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка).
    // Сами числа a и b в диапазоне не учитывать. Если a >= b вывести сообщение "Некорректный ввод".
    static void task2() {
        Scanner sc = new Scanner(System.in);
        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();
        for (;numberOne < numberTwo; numberOne++) {
            if ((numberOne % 5 == 0) && (numberOne % 10 != 0)) {
                System.out.println(numberOne);
            }
        }
    }

    // 3. Реализовать программу No2, используя цикл while.
    static void task3() {
        Scanner sc = new Scanner(System.in);
        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();
        while (numberOne < numberTwo) {
            if ((numberOne % 5 == 0) && (numberOne % 10 != 0)) {
                System.out.println(numberOne);
            }
            numberOne++;
        }
    }
}
