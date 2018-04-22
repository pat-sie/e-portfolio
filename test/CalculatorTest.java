package de.dhbwka.softwareeng.eportfolio.calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

import de.dhbwka.softwareeng.eportfolio.calculator.Calculator;
import de.dhbwka.softwareeng.eportfolio.calculator.DivideByZeroException;

public class CalculatorTest {

	@Test
	public void test_Add() {
		Calculator calc = new Calculator();
		assertThat(calc.add(1, 1), is(2));
	}
	
	@Test
	public void test_Substract() throws Exception {
		Calculator calc = new Calculator();
		assertThat(calc.substract(2, 1), is(1));
	}
	
	@Test
	public void test_Divide() throws Exception {
		Calculator calc = new Calculator();
		assertThat(calc.divide(3, 2), is(1.5));
	}
	
	@Test(expected = DivideByZeroException.class)
	public void test_DivideByZero() throws Exception {
		Calculator calc = new Calculator();
		calc.divide(1, 0);
	}

}
