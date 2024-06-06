package ejemploAnotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotacionScopeConfiguration {

	public static void main(String[] args) {
		//Cargar el XML de configuración
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//No hace falta al crear el archivo de configuración .CLASS
		
		
		//Cargar el .CLASS de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
		//Petición de BEAN al contenedor
		 
		Empleados comercial1 = contexto.getBean("comercialExperimentado",Empleados.class);
		Empleados comercial2 = contexto.getBean("comercialExperimentado",Empleados.class);
		Empleados comercial3 = contexto.getBean("comercialExperimentado",Empleados.class);
		
		Empleados directorFinanciero1 = contexto.getBean("directorFinanciero",Empleados.class);
		DirectorFinanciero directorFinanciero2 = contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		/*Como los datos email y nombreEmpresa son propios de la clase DirectorFinanciero,
		y no de la interfaz Empleados, hay que crear el objeto de tipo DirectorFinanciero.
		También hay que solicitar el bean espeficando la clase DirectorFinanciero
		*/
		
		//Comprobar si apuntan al mismo objeto en memoria
		System.out.println(comercial1);
		System.out.println(comercial2);
		System.out.println(comercial3);
		
		
		//Comprobación del DirectorFinanciero
		System.out.println(directorFinanciero1.getTareas());
		System.out.println(directorFinanciero1.getInforme());
		System.out.println("Email del Director2: "+directorFinanciero2.getEmail());
		System.out.println("Nombre de la empresa (Director2): " +directorFinanciero2.getNombreEmpresa());

		
		
		//Cierre del contexto
		contexto.close();
	}

}
