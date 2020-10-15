package com.phoo;

public class InchestoFeetConversion {
	public void convert(int inches) {
		
		int feet=inches/12;
		int in=inches%12;
		
		if(in==0) {
			System.out.println(inches+"\""+" equals with "+feet+"\'.");
		}
		else {
			System.out.println(inches+"\""+" equals with "+feet+"\'"+in+"\".");
		}
	}
}
