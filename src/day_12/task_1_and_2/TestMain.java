package day_12.task_1_and_2;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<String> stampCar = new ArrayList<>();
        stampCar.add("BMW");
        stampCar.add("Mers");
        stampCar.add("Citroen");
        stampCar.add("Lada");
        stampCar.add("PSG");

        for (String str : stampCar) {
            System.out.println(str);
        }

        System.out.println();

        stampCar.add(3, "Doma");
        stampCar.remove(0);

        for (String str : stampCar) {
            System.out.println(str);
        }

        List<Integer> intNumber = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                intNumber.add(i);
            }
        }

        for (Integer i : intNumber) {
            System.out.println(i);
        }

        for (int i = 300; i < 351; i++) {
            if (i % 2 == 0) {
                intNumber.add(i);
            }
        }

        for (Integer i : intNumber) {
            System.out.print(" " + i);
        }
    }
}