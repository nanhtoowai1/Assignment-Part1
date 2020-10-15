package com.phoo;

public class StringSplit {

	public static void main(String[] args) {
		String value="1#SuSu#16";
		
		String[] data=value.split("#");
		Person person=new Person();
		person.setId(Integer.parseInt(data[0]));
		person.setAge(Integer.parseInt(data[2]));
		person.setName(data[1]);
		
		System.out.println(person.toString());
	}

}
