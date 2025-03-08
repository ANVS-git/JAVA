abstract class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract void calculateSalary();

    public void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private final int salary = 50000;

    public FullTimeEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override 
    void calculateSalary() {
        showDetails();
        System.out.println("Salary: ₹" + salary);
        System.out.println();
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private final int ratePerHour = 500;

    public PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        int salary = hoursWorked * ratePerHour;
        showDetails();
        System.out.println("Salary: ₹" + salary);
        System.out.println();
    }
}

public class Employment_Management {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Ramya", 101);
        PartTimeEmployee emp2 = new PartTimeEmployee("Sharmi", 102, 20);

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}
