public class Worker extends Employee {
    private double fixedSalary;

    public Worker(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return fixedSalary;
    }
}