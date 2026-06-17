package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPayCalculator {

    PayCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new PayCalculator();
    }

    @Test
    public void testGetPayRate() {
        assertEquals(16.78, calculator.getPayRate(), 0.001);
    }

    @Test
    public void testCalculateGrossPayWithoutOvertime() {
        assertEquals(671.20, calculator.calculateGrossPay(40), 0.001);
    }

    @Test
    public void testCalculateGrossPayWithOvertime() {
        assertEquals(797.05, calculator.calculateGrossPay(45), 0.001);
    }
    @Test
    public void testCalculateSocialSecurity() {
        assertEquals(60.00, calculator.calculateSocialSecurity(1000.00), 0.001);
    }

    @Test
    public void testCalculateFederalTax() {
        assertEquals(140.00, calculator.calculateFederalTax(1000.00), 0.001);
    }

    @Test
    public void testCalculateStateTax() {
        assertEquals(50.00, calculator.calculateStateTax(1000.00), 0.001);
    }
    @Test
    public void testCalculateUnionDues() {
        assertEquals(10.00, calculator.calculateUnionDues(), 0.001);
    }

    @Test
    public void testCalculateInsuranceWithLessThanThreeDependents() {
        assertEquals(15.00, calculator.calculateInsurance(2), 0.001);
    }

    @Test
    public void testCalculateInsuranceWithThreeOrMoreDependents() {
        assertEquals(35.00, calculator.calculateInsurance(3), 0.001);
    }
    @Test
    public void testCalculateTotalExpensesWithLessThanThreeDependents() {
        assertEquals(275.00, calculator.calculateTotalExpenses(1000.00, 2), 0.001);
    }

    @Test
    public void testCalculateTotalExpensesWithThreeOrMoreDependents() {
        assertEquals(295.00, calculator.calculateTotalExpenses(1000.00, 3), 0.001);
    }
    @Test
    public void testCalculateNetPayWithLessThanThreeDependents() {
        assertEquals(725.00, calculator.calculateNetPay(1000.00, 2), 0.001);
    }

    @Test
    public void testCalculateNetPayWithThreeOrMoreDependents() {
        assertEquals(705.00, calculator.calculateNetPay(1000.00, 3), 0.001);
    }
}