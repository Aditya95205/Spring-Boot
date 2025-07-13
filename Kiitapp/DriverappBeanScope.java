package Kiitapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Kiitmodel.Engine;
import Kiitmodel.Gear;

public class DriverappBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");
	Engine engine1=beanFactory.getBean("e1",Engine.class);
		System.out.println(engine1);
		
		Gear gear1=(Gear)beanFactory.getBean("g1");
		System.out.println(gear1);
	}

}
