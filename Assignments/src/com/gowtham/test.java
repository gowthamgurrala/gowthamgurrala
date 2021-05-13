package com.gowtham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[]args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/gowtham/applicationContext.xml");
		Employee emp=(Employee)ctx.getBean("empbean");
		System.out.println(emp);
		
}
}
