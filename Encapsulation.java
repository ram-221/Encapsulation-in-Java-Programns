package com.encapsulation;

class Area{
	int length;
	int breadth;
	
	Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		int area = length * breadth;
		System.out.println("Your Rectangle Area is :"+area);
	}
}


public class Encapsulation {

	public static void main(String args[]) {
		Area rect = new Area(13,5);
		rect.getArea();
	}
}
