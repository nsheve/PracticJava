package day_8;

public class TestJava {
    public static void main(String[] args) {
        //task 2
        Airplane airplane = new Airplane("Nikita", 100, 250, 40, 20);
        System.out.println(airplane);

        //task 1
        //String numbers = "";

        //for (int i = 0; i < 20001; i++) {
          //  numbers = i + " ";
            //System.out.print(numbers);
        //}

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(" ");
            System.out.print(sb);
        }

    }
}
