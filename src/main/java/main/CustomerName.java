package main;

import java.util.Scanner;

public class CustomerName{
	String name;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
public static void main(String args[])
{
	CustomerName obj=new CustomerName();
	obj.setName("kavya");
	System.out.println(obj.getName());
}
	
}