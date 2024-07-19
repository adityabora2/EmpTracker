package com.Project.Employee_Management_System.Model;

public class Employee {
    
    //List of Attributes
    private Long id;
    private String name;
    private String department;
    private Double salary;
    
    //Constructors

    public Employee() {
    }

    public Employee(Long id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
            "Employee[ID=%d, Name='%s', Department='%s', Salary=%.2f]",
            id, name, department, salary
        );
    }
}
