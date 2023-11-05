import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
    private String ename;
    private int eno;
    private double basic;
    private double salary;
    private double TA;
    private double DA;
    private double HRA;

    public void setData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter employee name: ");
        ename = reader.readLine();

        System.out.print("Enter employee number: ");
        eno = Integer.parseInt(reader.readLine());

        System.out.print("Enter basic salary: ");
        basic = Double.parseDouble(reader.readLine());

        System.out.print("Enter TA: ");
        TA = Double.parseDouble(reader.readLine());

        System.out.print("Enter DA: ");
        DA = Double.parseDouble(reader.readLine());

        System.out.print("Enter HRA: ");
        HRA = Double.parseDouble(reader.readLine());

        calculateGrossSalary();
    }

    private void calculateGrossSalary() {
        salary = basic + TA + DA + HRA;
    }

    public void show() {
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Number: " + eno);
        System.out.println("Basic Salary: " + basic);
        System.out.println("TA: " + TA);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + salary);
        System.out.println();
    }

    public double getGrossSalary() {
        return salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].setData();
        }

        // Sort employees in descending order of gross salary using Bubble Sort
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getGrossSalary() < employees[j + 1].getGrossSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("Employees in descending order of gross salary:");
        for (Employee emp : employees) {
            emp.show();
        }
    }
}
