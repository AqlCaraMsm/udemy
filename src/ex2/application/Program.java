package ex2.application;

import ex2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = s.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = s.nextDouble();
        System.out.print("Tax: ");
        employee.tax = s.nextDouble();

        System.out.println();
        System.out.println("Employee: "+employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(s.nextDouble());

        System.out.println();
        System.out.printf("Updated data: "+employee);

        s.close();
    }
}
