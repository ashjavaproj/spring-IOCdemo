package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.model.Student;

public class J2EEContainerMain {
	public static void main(String[] args) {
		
		
		ApplicationContext z=new ClassPathXmlApplicationContext("bean.xml");
		
		    Student s=   (Student) z.getBean("stu");
		    
		    
			

}
}