package com.Project.Employee_Management_System.Service;



import org.springframework.stereotype.Service;

import com.Project.Employee_Management_System.Model.Employee;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();
    private Long currentId = 1L;

    
    // Add an employee
    
    public Employee addEmployee(Employee employee) {
        employee.setId(currentId++);
        employeeList.add(employee);
        return employee;
    }

    
    // Get all employees
    
    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeList);
    }

    
    // Get employee by ID
    
    public Employee getEmployeeById(Long id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    
    // Delete employee by ID
    
    public boolean deleteEmployee(Long id) {
        return employeeList.removeIf(employee -> employee.getId().equals(id));
    }

    
    // Update employee details
    
    public Employee updateEmployee(Long id, Employee employeeDetails) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                employee.setName(employeeDetails.getName());
                employee.setDepartment(employeeDetails.getDepartment());
                employee.setSalary(employeeDetails.getSalary());
                return employee;
            }
        }
        return null;
    }
}
