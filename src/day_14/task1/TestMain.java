package day_14.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestMain {

    public static void printSumDigits(File file) {
        try {
            Scanner sc = new Scanner(file);

            String line = sc.nextLine();
            String [] str = line.split(" ");

            if (str.length != 10) {
                throw new IllegalAccessException();
            }

            int sum = 0;
            for (String str1 : str) {
                sum += Integer.parseInt(str1);
                System.out.println(sum);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }

    }

    public static void main(String[] args) {
        File file = new File("/Users/nikitasheve/Documents/Practic/src/day_14/task1/number.txt");
        printSumDigits(file);
    }
}
