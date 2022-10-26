package com.gyojincompany.test;

public class Soldier {
	
	private String name;
	private int age;
	private String grade;
	
	public Soldier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Soldier(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void getSoldierInfo() { //핵심기능
		System.out.println("***자기소개하기***");//공통기능
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("계급 : " + getGrade());
		
	}
	
	

}
