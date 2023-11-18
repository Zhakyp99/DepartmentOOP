package organization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Department {
    private String name;
    private List<Employee> employees = new ArrayList<Employee>();
    public Department(){}
    public Department(String name){
        this.name = name;
    }

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //count of employees
    public void countEmployee(){
        System.out.println("number of employees " + employees.size());
    }
    //sum salary
    public double getTotalSalary(){
        double totalSalary = 0.0;
        for(Employee s:employees){
            totalSalary += s.getSalary();
        }
        return totalSalary;
    }
    public List<Employee> getEmployees(){
        return employees;
    }




    public void addEmployee(Employee anEmployee){
        employees.add(anEmployee);
    }
    public void resignEmployee(String name, String surname, String position){employees.remove(new Employee(name,surname,position,0));}


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
