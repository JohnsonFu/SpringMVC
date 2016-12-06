package com.example.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.controller.service.IService;

public class SpringTest {
public static void main(String[] args){
	ApplicationContext appliationContext=new ClassPathXmlApplicationContext("applicationContext.xml"); 
	IService hello=(IService)appliationContext.getBean("service");
	hello.service("halloween");
}
}
