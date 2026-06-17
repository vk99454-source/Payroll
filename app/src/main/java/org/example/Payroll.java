package org.example;

import org.example.PayCalculator;

import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    PayCalculator calculator = new PayCalculator();

    System.out.println("Welcome to the Payroll Calculator!");

    System.out.print("Enter the number of hours worked this week: ");
    double hoursWorked = input.nextDouble();

    System.out.print("Enter the number of dependents: ");
    int dependents = input.nextInt();

    System.out.println("You worked " + hoursWorked + " hours this week.");
    System.out.println("You have " + dependents + " dependents.");

    double payRate = calculator.getPayRate();
    double grossPay = calculator.calculateGrossPay(hoursWorked);
    double totalExpenses = calculator.calculateTotalExpenses(grossPay, dependents);
    double netPay = calculator.calculateNetPay(grossPay, dependents);

    System.out.println();
    System.out.println("Payroll Report");
    System.out.println("----------------------");
    System.out.println("Hours worked: " + hoursWorked);
    System.out.printf("Rate of pay: $%.2f%n", payRate);
    System.out.printf("Gross pay: $%.2f%n", grossPay);
    System.out.printf("Total expenses: $%.2f%n", totalExpenses);
    System.out.printf("Net pay: $%.2f%n", netPay);
System.out.println();
System.out.println("Thank you for using the Payroll Calculator. Goodbye!");
    input.close();
  }
}