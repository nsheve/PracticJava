package day_13;

public class TestMain {
    public static void main(String[] args) {
        User user1 = new User("Nikita");
        User user2 = new User("Daniil");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "God Game");

        user2.sendMessage(user1, "GG");

        MessageDatabase.showDialog(user1, user2);
    }
}
