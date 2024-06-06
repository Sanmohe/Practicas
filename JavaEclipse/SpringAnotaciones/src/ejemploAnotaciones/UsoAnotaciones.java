package ejemploAnotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		//Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Petición de BEAN al contenedor
		Empleados comercial = contexto.getBean("comercialExperimentado",Empleados.class);

		//Uso del BEAN
		System.out.println(comercial.getInforme());
		System.out.println(comercial.getTareas());

		//Cierre del CONTEXTO
		contexto.close();
	}

}
