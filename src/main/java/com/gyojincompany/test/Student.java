package com.gyojincompany.test;

public class Student {
	
	private String name;
	private int age;
	private int gradeNum;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int gradeNum) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
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
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	
	
	public void getStudentInfo() { //핵심기능
		System.out.println("이름 : "+ getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학년 : " + getGradeNum());
		
	}
	

}
