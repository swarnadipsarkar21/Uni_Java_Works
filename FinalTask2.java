public class FinalTask2 {
   

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[numberOfEmployees];
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Cannot add more employees to " + companyName);
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + employees[i].getName());
        }
    }
}

class Position {
    private String title;
    private int salary;

    public Position(String title, int salary) {
        this.title = title;
        this.salary = salary;
    }

    public void showPositionInfo() {
        System.out.println("Title: " + title);
        System.out.println("Salary: " + salary);
    }
}

public class AssociationRelationship {
    public static void main(String[] args) {

        Company c = new Company("Orbitax", 3);
        c.addEmployee(new Employee("Fuad"));
        c.addEmployee(new Employee("Musfique"));
        c.addEmployee(new Employee("Swarnadip"));

        c.showEmployee();
        System.out.println();

        Position p cntc = new Position ("MD", 100000);

        c.showPositionInfo();
    }
}
}
