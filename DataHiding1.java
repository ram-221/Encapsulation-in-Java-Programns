package com.encapsulation;

class Person1{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

public class DataHiding1 {

	public static void main(String args[]) {
		Person1 p = new Person1();
		p.setAge(52);
		System.out.println("our Age is : "+p.getAge());
	}
}
