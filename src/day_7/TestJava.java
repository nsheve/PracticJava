package day_7;

// 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
// В классе Самолет создать статический метод compareAirplanes,
// который в качестве аргументов принимает два объекта класса Airplane (два самолета) и
// выводит сообщение в консоль о том, какой из самолетов длиннее.

// 2.

public class TestJava {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Nikita", 10, 52, 30, 1);
        Airplane airplane2 = new Airplane("Sheve", 15, 51, 32, 5);

        Airplane.compareAirplanes(airplane1, airplane2);

        Player player1 = new Player(12);
        Player player2 = new Player(13);
        Player player3 = new Player(14);

        player3.info();

        Player player4 = new Player(15);
        Player player5 = new Player(16);
        Player player6 = new Player(17);

        player6.info();

        for (int i = 0; i < 12; i++) {
            player1.run();
        }

        player6.info();

    }
}
