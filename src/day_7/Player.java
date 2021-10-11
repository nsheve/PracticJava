package day_7;

public class Player {
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getMAX_STAMINA() {
        return MAX_STAMINA;
    }

    public int getMIN_STAMINA() {
        return MIN_STAMINA;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }

        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Еще есть места для " + (6 - countPlayers));
        } else {
            System.out.println("Мест нет!");
        }
    }
}
