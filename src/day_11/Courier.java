package day_11;

public class Courier implements Worker {
    private int salary = 0;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = getSalary() +  100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary = getSalary() + (100 * 2);
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
