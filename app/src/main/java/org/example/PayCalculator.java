package org.example;

public class PayCalculator {

    public double getPayRate() {
        return 16.78;
    }

    public double calculateGrossPay(double hoursWorked) {
        double payRate = getPayRate();
        double grossPay;
        if (hoursWorked <= 40) {
            grossPay = hoursWorked * payRate; }
        else {
            double overtimehours = hoursWorked - 40;
            double regularPay = 40 * payRate;
            double overtimePay = overtimehours * payRate * 1.5;
            grossPay = regularPay + overtimePay;
        }
        return grossPay;
    }

    public double calculateSocialSecurity(double grossPay) {
        double socialSecurity = grossPay * 0.06;
        return socialSecurity;
    }

    public double calculateFederalTax(double grossPay) {
        double federalTax = grossPay * 0.14;
        return federalTax;
    }

    public double calculateStateTax(double grossPay) {
        double stateTax = grossPay * 0.05;
        return stateTax;
    }

    public double calculateUnionDues() {
        return 10.00;
    }

    public double calculateInsurance(int dependents) {
        double insurance;
        if(dependents >= 3) {
            insurance = 35.00; }
        else {
            insurance = 15.00;
        }
        return insurance;
    }

    public double calculateTotalExpenses(double grossPay, int dependents) {
        double socialSecurity = calculateSocialSecurity(grossPay);
        double federalTax = calculateFederalTax(grossPay);
        double stateTax = calculateStateTax(grossPay);
        double unionDues = calculateUnionDues();
        double insurance = calculateInsurance(dependents);

        double totalExpenses = socialSecurity + federalTax + stateTax + unionDues + insurance;

        return totalExpenses;
    }

    public double calculateNetPay(double grossPay, int dependents) {
        double totalExpenses = calculateTotalExpenses(grossPay, dependents);
        double netPay = grossPay - totalExpenses;
        return netPay;
    }
}