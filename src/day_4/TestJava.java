package day_4;

import java.util.Random;
import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {
        Random random = new Random();
        //task1(random);
        //task2(random);
        //task3(random);
        task4(random);
    }

    // 1. С клавиатуры вводится число n - размер массива.
    // Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
    // Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
    //а) Длине массива
    //б) Количестве чисел больше 8
    //в) Количестве чисел равных 1
    //г) Количестве четных чисел
    //д) Количестве нечетных чисел
    //е) Сумме всех элементов массива
    static void task1(Random random) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        }

        //a
        System.out.println("Длинна массива: " + array.length);

        //б
        int number = 0;
        for (int k : array) {
            if (k > 8) {
                number++;
            }
        }
        System.out.println("Количество чисел больше 8: " + number);

        //в
        number = 0;
        for (int k : array) {
            if (k == 1) {
                number++;
            }
        }
        System.out.println("Количество чисел равных 1: " + number);

        //г
        number = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                number++;
            }
        }
        System.out.println("Количество четных чисел: " + number);

        //д
        number = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                number++;
            }
        }
        System.out.println("Количество нечетных чисел: " + number);

        //е
        number = 0;
        for (int j : array) {
            number += j;
        }
        System.out.println("Сумма всех элементов: " + number);
    }

    // 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
    //Затем, используя циклы for each вывести:
    //- наибольший элемент массива
    //- наименьший элемент массива
    //- количество элементов массива, оканчивающихся на 0
    //- сумму элементов массива, оканчивающихся на 0
    static void task2(Random random) {
        int[] array = new int[100];
        for(int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

        int summa = 0;
        int number = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                summa += i;
                number++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + number);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + summa);
    }

    // 3. Заполнить двумерныей массив (матрицу) случайными числами от 0 до 50.
    // Размер матрицы задать m=12, n = 8 (m - размерность по строкам, n - размерность по колонкам).
    // В консоль вывести индекс строки, сумма чисел в которой максимальна.
    // Если таких строк несколько, вывести индекс последней из них.
    static void task3(Random random) {
        int[][] array = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        int maxSumma = 0;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            int summa = 0;
            for (int j = 0; j < 8; j++) {
                summa += array[i][j];
            }
            if (summa > maxSumma) {
                maxSumma = summa;
                index = i;
            }
        }

        System.out.println("максимальная сумма в строке: " + index);
    }

    // 4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
    //Найти максимум среди сумм трех соседних элементов.
    // Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
    static void task4(Random random) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxSumma = 0;
        int index = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int summa = array[i] + array[i + 1] + array[i + 2];
            if (summa > maxSumma) {
                maxSumma = summa;
                index = i;
            }
        }

        System.out.println("Максимальная сумма из 3-х чисел: " + maxSumma);
        System.out.println("Index: " + index);
    }
}
