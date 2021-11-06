package day_12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBandList) {
        List<MusicBand> band = new ArrayList<>();
        for (MusicBand ms : musicBandList) {
            if (ms.year > 2000) {
                band.add(ms);
            }
        }
        return band;
    }

    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand(1999, "gg");
        MusicBand musicBand2 = new MusicBand(2001, "aa");
        MusicBand musicBand3 = new MusicBand(2005, "ii");
        MusicBand musicBand4 = new MusicBand(1997, "bb");
        MusicBand musicBand5 = new MusicBand(2006, "ff");
        MusicBand musicBand6 = new MusicBand(2020, "cc");
        MusicBand musicBand7 = new MusicBand(2021, "ss");
        MusicBand musicBand8 = new MusicBand(1993, "nn");
        MusicBand musicBand9 = new MusicBand(1985, "mm");
        MusicBand musicBand10 = new MusicBand(1978, "jj");

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        System.out.println("Начальный список");
        for (MusicBand ms : musicBandList) {
            System.out.println(ms);
        }

        musicBandList = groupsAfter2000(musicBandList);

        System.out.println("Группы после 2000 года");
        for (MusicBand ms : musicBandList) {
            System.out.println(ms);
        }
    }
}
