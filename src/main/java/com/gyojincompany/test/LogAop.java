package com.gyojincompany.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.gyojincompany.test.Soldier)")
	private void pointcutMethod() {
		
	}
	
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		//공통기능 분리
		String signatureStr = joinpoint.getSignature().toString();
		
		System.out.println(signatureStr+"메서드가 시작됨!!");
		System.out.println("***자기소개하기***");//공통기능
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			System.out.println(signatureStr+"메서드가 종료되었음!!");
		}
	}

}
