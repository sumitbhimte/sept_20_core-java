package com.ltts;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		
		c.setName("Ravi");
		c.setAddress("Pune");
		c.setMobile("9999888666");
		System.out.println("Name:"+c.getName()+"\n"+"Address:"+c.getAddress()+"\n"+"Mobile:"+c.getMobile());

	}

}
