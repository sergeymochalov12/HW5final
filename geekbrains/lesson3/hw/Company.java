import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Company implements Iterable<Employee> {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Freelancer("John", 25));
        company.addEmployee(new Worker("Mike", 1800));
        company.addEmployee(new Worker("Nike", 2000));
        company.addEmployee(new Worker("Dike", 1900));
        company.addEmployee(new Freelancer("Dohn", 20));

        for(Employee e : company) {
            System.out.println(e.getName() + ": " + e.calculateMonthlySalary());
        }

        Collections.sort(company.employees, new SalaryComparator());
    }
}
