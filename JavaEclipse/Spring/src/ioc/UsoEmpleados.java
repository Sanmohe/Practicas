package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*
		// Creación de objetos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso del objeto creado
		System.out.println(Empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Esto llama al XML para utilizar los beans de creación de objetos
		
		//Empleados director = contexto.getBean("nuevoDirector", Empleados.class);
		//Esto crea el objeto llamando al bean definido en el XML.
		//Los parámetros del método son el ID del bean (String) y la interfaz que se implementa)
		DirectorEmpleado director = contexto.getBean("nuevoDirector", DirectorEmpleado.class);
		/* Como los campos a inyectar, junto con sus métodos SET y GET, se declaran en la clase SecretarioEmpleado y no en la interfaz Empleados,
		 * la clase a la que debe apuntar el bean debe ser SecretarioEmpleado. */
		
		//Empleados jefe = contexto.getBean("nuevoJefe", Empleados.class);
		JefeEmpleado jefe = contexto.getBean("nuevoJefe", JefeEmpleado.class);
		//Empleados secretario = contexto.getBean("nuevoSecretario", Empleados.class);
		SecretarioEmpleado secretario = contexto.getBean("nuevoSecretario", SecretarioEmpleado.class);
		
				
		System.out.println(director.getTareas());
		System.out.println(director.getInforme());
		System.out.println("Email: " + director.getEmail());
		System.out.println("Empresa: " + director.getNombreEmpresa());
		
		System.out.println("");
		
		System.out.println(jefe.getTareas());
		System.out.println(jefe.getInforme());
		System.out.println("Email: " + jefe.getEmail());
		System.out.println("Empresa: " + jefe.getNombreEmpresa());
		
		System.out.println("");
		
		System.out.println(secretario.getTareas());
		System.out.println(secretario.getInforme());
		System.out.println("Email: " + secretario.getEmail());
		System.out.println("Empresa: " + secretario.getNombreEmpresa());
				
				
		contexto.close();
		//Se debe cerrar el contexto para ahorrar recursos
		
				
	}

}
