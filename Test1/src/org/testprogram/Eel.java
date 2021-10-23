package org.testprogram;

public class Eel extends Fish{
	
	private String charge;
	
	public Eel() {
		this.charge = "releases electric charge";
	
	}

	
	public String Showinfo() {
		return "Eel [charge=" + charge + ", medium=" + medium + ", gills=" + gills + ", height=" + height + ", weight="
				+ weight + ", blood_type=" + blood_type + ", animal_type=" + animal_type + "]";
	}


	

	
}
