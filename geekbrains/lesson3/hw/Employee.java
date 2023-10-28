
public abstract class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateMonthlySalary();

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
    // 
}
