package ch03;

public abstract class Beverage {
	String description = "No Name";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
