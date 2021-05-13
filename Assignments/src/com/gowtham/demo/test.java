package com.gowtham.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/gowtham/demo/applicationContext.xml");
		Employee emp = (Employee) ctx.getBean("e");
		System.out.println(emp);
	}

}
