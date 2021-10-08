package day_1;

import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
    }

   // 1. Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
   static void task1() {
        System.out.println("task 1");
        int numberIteration = 0;
        while(numberIteration < 10) {
            System.out.print("JAVA ");
            numberIteration++;
        }
    }

    // 2. Повторить задание 1, но используя цикл for.
    static void task2() {
        System.out.println("task 2");
        for(int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }
    }

    // 3. Вывести в столбик "JAVA" 10 раз
    static void task3() {
        System.out.println("task 3");
        for (int i = 0; i < 10; i++) {
            System.out.println("JAVA ");
        }
    }

    //4. Объявите переменную типа int, имя переменной - year. Присвойте этой переменной значение 1980.
    // Используя цикл while, выведите в столбик строки вида “Олимпиада X года”,
    // где X - это число, которое принимает значения, начиная от 1980 до 2020 с шагом увеличения равным,
    //То есть на первой итерации цикла, X равен 1980, а на каждой следующей итерации, значение X увеличивается на
    // Строки такого вида выводятся до тех пор, пока значение X не станет больше 2020.
    static void task4() {
        System.out.println("task 4");
        int year = 1980;
        while(year < 2021) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }

    //5. Повторить задание 4, но используя цикл for.
    static void task5() {
        System.out.println("task 5");
        for(int year = 1980; year < 2021; year += 4){
            System.out.println("Олимпиада " + year + " года");
        }
    }

    //6. Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9.
    // Используя цикл на ваше усмотрение (for или while),
    // выведите в консоль таблицу умножения для этой цифры в следующем формате:
    static void task6() {
        System.out.println("task 6");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }
    }
}
