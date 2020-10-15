package com.phoo;

public class DataTypeConversion {
	
	public static void main(String[] args) {
		//int a=12; primitive type
		//Integer b=12; object type
		
		//Integer.parseInt=Change primitive data types(Str to int)
		//Integer.valueOf=Change object type(str to obj)
		
		String value1="12";
		try {
			int a=Integer.parseInt(value1);
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println("Exception occurs");
		}
		
		String value2="16a";
		try {
			Integer b =Integer.valueOf(value2);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
		
		
	}

}
