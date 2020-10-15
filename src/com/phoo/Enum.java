package com.phoo;

enum Color{yellow,green,red};
//enum=used to define own datatypes

public class Enum {
	public void setColor(Color color) {
		System.out.println("Color is "+color+".");
	}
	public static void main(String[] args) {
		Enum obj=new Enum();
		obj.setColor(Color.yellow);
	}
	
}
