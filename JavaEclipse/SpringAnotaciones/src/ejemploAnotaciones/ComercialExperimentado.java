package ejemploAnotaciones;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//CREACIÓN DE BEAN
@Component
/*
 * Este BEAN permite crear objetos de la clase Comercial.
 * Se pone el nombre del BEAN entre comillas.
 * Si no se pone nombre, Spring asocia directamente el nombre de la clase como nombre del BEAN
 * pero con la primera letra minúscula.
 */


//SCOPE O PATRÓN DE DISEÑO
@Scope("singleton")
/*
 * Establece el patrón de diseño, apuntando al mismo objeto (Singleton)
o creando uno nuevo cada vez que se solicita el bean
*/


public class ComercialExperimentado implements Empleados {
	//INYECCIÓN DE DEPENDENCIA CON EL CAMPO QUE APUNTA A LA INTERFAZ Y AUTOWIRED
	@Autowired
	@Qualifier("informeFinanciero1T")
	private CrearInformeFinanciero informe1T;

	@Autowired
	@Qualifier("informeFinanciero3T")
	private CrearInformeFinanciero informe3T;


	//INYECCIÓN DE DEPENDENCIAS CON CONSTRUCTOR Y AUTOWIRED
	/*
	@Autowired
	public ComercialExperimentado(CrearInformeFinanciero informe) {
		informe1T = informe;
	} */
	/*
	 * Inyectamos la dependencia para que un ComercialExperiemntado pueda emitir InformesFinancieros
	 * AUTOWIRED: Spring busca en todo el proyecto alguna clase que implemente la interfaz CrearInformeFinanciero.
	 * Si la encuentra, empleará esa clase para la Inyección de Dependencia
	 */


	//INYECCIÓN DE DEPENDENCIA CON SETTER Y AUTOWIRED
	/*
	 * @Autowired
	public void setInforme1T(CrearInformeFinanciero informe1t) {
	informe1T = informe1t;
	}
	 * El método no tiene por qué ser un SETTER, puede tener cualquier nombre
	 * siempre que llame a la interfaz, AUTOWIRED hará su función.
	 */


	//CÓDIGO DESPUÉS DE LA CREACIÓN Y ANTES DE LA EJECUCIÓN DEL BEAN (INIT)
	@PostConstruct
	public void header() {		//No debe recibir argumentos o parámetros de entrada
		System.out.println("ENCABEZADO INICIAL");
	}

	
	//CÓDIGO DESPUÉS DE LA CREACIÓN DEL BEAN (DESTROY)
	@PreDestroy
	public void footer() {		//No debe recibir argumentos o parámetros de entrada
		System.out.println("FINAL DE EJECUCIÓN");
	}


	//MÉTODOS DE LA INTERFAZ (OVERRIDE)
	@Override
	public String getTareas() {
		return "Función Comercial: Vender productos";
	}

	@Override
	public String getInforme() {
		return "Informe creado por Comercial: " + informe3T.getInformeFinanciero();
	}




}
