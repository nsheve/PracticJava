package day_11;

public class Picker implements Worker {
    private int salary = 0;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() == 10) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary = getSalary() + (80 * 3);
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
