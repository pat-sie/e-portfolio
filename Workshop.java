package de.dhbwka.softwareeng.eportfolio.car;

public class Workshop {
	
	public Car paint (Car car, String color) {
		car.setColor(color);
		return car;
	}
	
	public Car tune (Car car) {
		car.setHP(car.getHP() + 50);
		return car;
	}
	
}
