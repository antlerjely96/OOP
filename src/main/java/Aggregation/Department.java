package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
