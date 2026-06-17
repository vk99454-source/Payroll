package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayrollTest {
  // This is a simple test to make sure the Payroll class can be created.
  // The main payroll math is tested in TestPayCalculator.java.

  @Test
  void appCanBeCreated() {
    Payroll payroll = new Payroll();

    assertNotNull(payroll);
  }
}
