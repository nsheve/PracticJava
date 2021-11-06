package day_12.task4;

public class MusicBand {
    int year;
    String name;

    public MusicBand(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
