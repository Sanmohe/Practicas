package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoSingletonPrototype {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		//Esto llama al XML para utilizar los beans de creación de objetos
		
				
		SecretarioEmpleado secretario1 = contexto.getBean("nuevoSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado secretario2 = contexto.getBean("nuevoSecretario", SecretarioEmpleado.class);
		//Esto crea el objeto llamando al bean definido en el XML (Singleton).
		
		System.out.println("Creado con SINGLETON");
		System.out.println(secretario1);
		System.out.println(secretario2);
		
		//Como por defecto, Spring se basa en Singleton, tanto secretario1 como secretario2 apuntan al mismo objeto.
		//Al imprimir por pantalla, obtenemos la misma referencia (mismo objeto)
		
		if (secretario1==secretario2) {
			System.out.println("Apuntan al mismo objeto");
		} else {
			System.out.println("Apuntan a objetos distintos");
		}
		
		SecretarioEmpleado secretario3 = contexto.getBean("nuevoSecretarioPrototype",SecretarioEmpleado.class);
		SecretarioEmpleado secretario4 = contexto.getBean("nuevoSecretarioPrototype", SecretarioEmpleado.class);
		//Esto crea el objeto llamando al bean definido en el XML (Prototype).
		
		System.out.println("\n Creado con PROTOTYPE");
		System.out.println(secretario3);
		System.out.println(secretario4);
		//Al imprimir por pantalla, obtenemos distintas referencias (distintos objetos)
		
		
		if (secretario3==secretario4) {
			System.out.println("Apuntan al mismo objeto");
		} else {
			System.out.println("Apuntan a objetos distintos");
		}
	
		contexto.close();
		
		
	}

}
