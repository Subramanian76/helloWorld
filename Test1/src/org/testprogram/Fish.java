package org.testprogram;

public class Fish extends Animal {
	
	protected String medium ;
	protected boolean gills;
	
	public Fish() {
		height = 3;
		weight = 10;
		animal_type="Aquatic";
		blood_type="warm";
		this.medium = "water";
		this.gills = true;
	}

	
	public String Showinfo() {
		return "Fish [medium=" + medium + ", gills=" + gills + ", height=" + height + ", weight=" + weight
				+ ", blood_type=" + blood_type + ", animal_type=" + animal_type + "]";
	}


	
	
	

}
