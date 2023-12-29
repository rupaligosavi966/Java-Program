package com.collection;

public class User {
	private int id;
    private String name;//Properties
    public User(int id, String name) {
        this.id = id;
        this.name = name;//Creating of the constructor
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Employee extends User {//Creating Second Properties
   
    private double salary;
public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;//Creating second Constructor
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; //Salary of the month 
    }
}



public class SalaryCalculator {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee employee = new Employee(1, "Rupali", 5000650);

        // Calculate and display the annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee: " + employee.getName());
        System.out.println("Annual Salary: $" + annualSalary);
    }
}