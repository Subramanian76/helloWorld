package org.testprogram;

public class Animal {

	protected float height;
	protected float weight;
	protected String blood_type;
	protected String animal_type;
	
	
	public Animal() {
		
		this.height = 0;
		this.weight = 0;
		this.blood_type = "unknown";
		this.animal_type = "unknown";
	}
	
	
	public String Showinfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", blood_type=" + blood_type + ", animal_type="
				+ animal_type + "]";
	}

}
