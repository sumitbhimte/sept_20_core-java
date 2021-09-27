package com.ltts;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company com = new Company();
		
		com.setName("L&T Technology Services");
		com.setEmployee("Ravi,Ram,Krishna,Shakir,Thomas");
		com.setTeamlead("Thomas");
		
		if(com.getTeamlead() == "Thomas")
		{
		System.out.println("Name:- "+com.getName()+"\n"+"Employees:- "+com.getEmployee()+"\n"+"Lead:- "+com.getTeamlead());
		}
		
		else {
			System.out.println("Invalid Input");
		}
	}

}
