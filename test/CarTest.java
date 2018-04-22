package de.dhbwka.softwareeng.eportfolio.car;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CarTest {

	@Test
	public void test_Position() throws Exception {
		Car car = new Car("blue", 50);
		car.drive(100);
		assertThat(car.getPosition(), is(100));
	}
	
	@Test
	public void test_Color() throws Exception {
		Car car = new Car("blue", 50);
		assertThat(car.getColor(), startsWith("bl"));
	}

}
