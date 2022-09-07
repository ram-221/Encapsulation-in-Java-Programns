package com.polymorphism;

// Data Hiding in java

class Person{
	
	public float height;
	private float weight;
	
	public float GetWeight() {
		return weight;
	}
	
	public float SetWeight(float weight) {
		if(weight >= 0) 
			this.weight = weight;
			return this.weight;
	
	}
}


public class DataHiding {

	public static void main(String args[]) {
		Person p = new Person();
		p.height = 60;
		//System.out.println("Height : "+ height)
		p.SetWeight((float)100.36);
		System.out.println("Weight = "+p.GetWeight());
	}
}
