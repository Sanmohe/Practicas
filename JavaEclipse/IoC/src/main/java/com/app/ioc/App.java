package com.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Medico medico = context.getBean("opera", Medico.class);
		medico.operar();
		
		context.close();
	}

}
