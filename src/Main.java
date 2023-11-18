import organization.Employee;
import organization.Department;

import java.util.*;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Employee e1 = new Employee("Jacob","Jakiya","junior dev",350000);
       Employee e2 = new Employee("Mirzhakyp","Zhakiya","java dev",500000);
       Employee e3 = new Employee("Azamat","Kozhakul","lead engineer", 150000);

        Department dept = new Department("IT");
        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(e3);

        List<Employee> emps = dept.getEmployees();
        for(Employee emp: emps) {
            System.out.println(emp);
        }

        dept.countEmployee();
        dept.resignEmployee("Mirzhakyp","Zhakiya","java dev");
        dept.countEmployee();

        for(Employee emp: emps) {
            System.out.println(emp);
        }


    }
}