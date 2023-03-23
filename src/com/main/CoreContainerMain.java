package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student;

public class CoreContainerMain {

	public static void main(String[] args) {
		
			
			Resource resource=new ClassPathResource("bean.xml");
			
			BeanFactory beanfactory=new XmlBeanFactory(resource);
			
			Student s=   (Student)  beanfactory.getBean("stu");
			
				

	}
}
