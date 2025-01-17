package com.sivabalaji.assignment1;
import com.sivabalaji.assignment1.employees.Developer;
import com.sivabalaji.assignment1.employees.Manager;
import com.sivabalaji.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {
      
        Manager manager = new Manager("sivabalaji", 100, 65000, 10);
        Developer developer = new Developer(" bharath", 101, 70000, "Java");

   
        EmployeeUtilities utilities = new EmployeeUtilities();

   
        System.out.println("Before Salary Increment:");
        utilities.printEmployeeDetails(manager);
        utilities.printEmployeeDetails(developer);

   
        utilities.increaseSalary(manager, 10);
        utilities.increaseSalary(developer, 10);

   
        System.out.println("\nAfter Salary Increment:");
        utilities.printEmployeeDetails(manager);
        utilities.printEmployeeDetails(developer);
    }
}

