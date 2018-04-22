package de.dhbwka.softwareeng.eportfolio.car;

public class Car {
	
	private String color;
	private int position = 0;
	private int hp;
	
	public Car(String color, int hp) {
		this.color = color;
		this.hp = hp;
	}
	
	public void drive(int meters) {
		position += meters;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getHP() {
		return this.hp;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
}
