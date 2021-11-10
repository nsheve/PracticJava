package day_14.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {
        File file = new File("/Users/nikitasheve/Documents/Practic/src/day_14/task3/people.txt");
        List<Person> personList = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] str = line.split(" ");

                if (Integer.parseInt(str[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                personList.add(new Person(str[0], Integer.parseInt(str[1])));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден : " + e);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл : " + e);
        }

        return personList;
    }
}
