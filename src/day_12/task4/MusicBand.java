package day_12.task4;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<String> member;

    public MusicBand(int year, String name, List<String> member) {
        this.year = year;
        this.name = name;
        this.member = member;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMember() {
        return member;
    }

    public void setMember(List<String> firstName) {
        this.member = firstName;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String member : a.getMember()) {
            b.getMember().add(member);
        }
        a.getMember().clear();
    }

    public void printMembers() {
        System.out.println(this.member);
    }
}
