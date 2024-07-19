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

    public Employee(Long Id, String Name, String Department, Double Salary) {
        this.id = Id;
        this.name = Name;
        this.department = Department;
        this.salary = Salary;
    }

    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String Department) {
        this.department = Department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double Salary) {
        this.salary = Salary;
    }

    @Override
    public String toString() {
        return String.format(
            "Employee[ID=%d, Name='%s', Department='%s', Salary=%.2f]",
            id, name, department, salary
        );
    }
}
