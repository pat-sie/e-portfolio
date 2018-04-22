package de.dhbwka.softwareeng.eportfolio.car;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WorkshopTest {

	@Test
	public void test_paint() throws Exception {
		Car car = new Car("blue", 50);
		Workshop ws = new Workshop();
		Car paintedCar = ws.paint(car, "black");
		assertThat(paintedCar.getColor(), is("black"));
	}
	
	@Test
	public void test_tune() throws Exception {
		Car car = new Car("blue", 50);
		Workshop ws = new Workshop();
		Car tunedCar = ws.tune(car);
		assertThat(tunedCar.getHP(), is(100));
	}

}
