package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoInitDestroy {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Empleados empleado = contexto.getBean("nuevoDirector",Empleados.class);
		
		System.out.println(empleado.getInforme());
		
		contexto.close();

	}

}
