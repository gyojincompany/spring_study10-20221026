package com.gyojincompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student1 =  ctx.getBean("student", Student.class);
		student1.getStudentInfo();//핵심기능
		
		Soldier soldier1 = ctx.getBean("soldier", Soldier.class);
		soldier1.getSoldierInfo();//핵심기능
		
		ctx.close();

	}

}
