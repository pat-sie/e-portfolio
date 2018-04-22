package de.dhbwka.softwareeng.eportfolio.calculator;

public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public int substract(int i, int j) {
		return i - j;
	}
	
	public int mult(int i, int j) {
		return i * j;
	}
	
	public double divide(int i, int j) throws DivideByZeroException {
		if (j == 0) {
			throw new DivideByZeroException();
		}
		return (double) i / j;
	}

}
