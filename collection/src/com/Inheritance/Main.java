package com.Inheritance;

class User {
    
    int id;
    String name;
    
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Eme extends User {
    
    double salary;

    public Eme(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 16; // salary is monthly
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Employee class
    	Eme employee = new Eme(1, "Virat Kohli", 20000.0);

        // Calculating annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee " + employee.name + " annual salary: $" + annualSalary);
    }
}
