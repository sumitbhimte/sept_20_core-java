package com.ltts;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setName("Ravi");
		e.setAddress("Pune");
		e.setMobile("918887777");
		System.out.println("Employee Details:\n");
		System.out.println(e.getName()+"\n"+e.getAddress()+"\n"+e.getMobile());

	}

}
