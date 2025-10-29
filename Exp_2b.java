import java.io.*;

class Employee {
    int empId;
    String emp_name;
    double emp_salary;

    void getinfo(int id, String name, double salary) {
        this.empId = id;
        this.emp_name = name;
        this.emp_salary = salary;
    }

    double CalculateGrossSalary() {
        double DA = this.emp_salary * 0.10;
        double HRA = this.emp_salary * 0.07;

        double gross_salary = this.emp_salary + DA + HRA;

        return gross_salary;
    }

    void display() {
        System.out.println("\nEmployee Id : " + this.empId);
        System.out.println("\nEmployee Name : " + this.emp_name);
        System.out.println("\nEmployee Salary : " + this.emp_salary);
        System.out.println("\nEmployee Gross Salary : " + CalculateGrossSalary());
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee emp = new Employee();

        System.out.println("Enter Employee Id : ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter Employee Name : ");
        String name = br.readLine();
        System.out.println("Enter Employee Salary : ");
        double salary = Double.parseDouble(br.readLine());

        emp.getinfo(id, name, salary);
        emp.display();

    }

}