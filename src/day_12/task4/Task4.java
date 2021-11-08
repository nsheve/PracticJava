package day_12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> member1 = new ArrayList<>();
        member1.add("Nikita");
        member1.add("Daniil");
        member1.add("Nasty");
        MusicBand musicBand1 = new MusicBand(1999, "Fest", member1);

        List<String> member2 = new ArrayList<>();
        member1.add("Nikita");
        member1.add("Daniil");
        member1.add("Nasty");
        MusicBand musicBand2 = new MusicBand(2000, "7star", member2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);
    }
}
