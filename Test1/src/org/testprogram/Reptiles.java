package org.testprogram;

public class Reptiles extends Animal {

	protected String skin,egg;
	protected boolean backbone;
	
	public Reptiles() {
		height = 10;
		weight = 50;
		animal_type= "reptile";
		blood_type="cold";
		this.skin = "dry";
		this.egg = "soft";
		this.backbone = true;
		
	}

	
	public String Showinfo() {
		return "Reptiles [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height + ", weight="
				+ weight + ", blood_type=" + blood_type + ", animal_type=" + animal_type + "]";
	}

	
	
	
	
	
}
