package day_14.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {

    public static List<String> parseFileToStringList() {
        File file = new File("/Users/nikitasheve/Documents/Practic/src/day_14/task2/people.txt");
        List<String> listPeople = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] people = line.split(" ");

                if (Integer.parseInt(people[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                listPeople.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден : " + e);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл : " + e);
        }

        return listPeople;
    }

    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }
}
