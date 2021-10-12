package day_11;

public class TestJAva {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        for (int i = 0; i < 10; i++) {
            courier.doWork();
            picker.doWork();
        }

        System.out.println(warehouse + " " + courier + " " + picker);
    }
}
