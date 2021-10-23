package org.testprogram;

public class Bird extends Animal{
	
	protected boolean feather;
	protected boolean fly;
	
	public Bird() {
		height = 2;
		weight = 10;
		animal_type = "Bird";
		blood_type="warm";
		this.feather = true;
		this.fly = true;
	
	}

	
	public String Showinfo() {
		return "Bird [feather=" + feather + ", fly=" + fly + ", height=" + height + ", weight=" + weight
				+ ", blood_type=" + blood_type + ", animal_type=" + animal_type + "]";
	}

	
	
	

}
