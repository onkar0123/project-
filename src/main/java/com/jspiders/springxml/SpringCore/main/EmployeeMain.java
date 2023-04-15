package com.jspiders.springxml.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springxml.SpringCore.bean.EmployeeBean;

public class EmployeeMain {
  
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeConfig.xml");
	     EmployeeBean emp1=context.getBean(EmployeeBean.class);
	     
	     System.out.println(emp1);
	     
	((ClassPathXmlApplicationContext)context).close();
}
}
