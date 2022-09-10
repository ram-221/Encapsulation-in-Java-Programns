package com.encapsulation;

class EncapsulatonDemo {

	private int empId;
    private String empName;
    private int empAge;

    
    public int getEmpId(){
        return empId;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpId(int newValue){
        empId = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
    	EncapsulatonDemo obj = new EncapsulatonDemo();
         obj.setEmpName("Murthi");
         obj.setEmpAge(28);
         obj.setEmpId(2022);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Id: " + obj.getEmpId());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
