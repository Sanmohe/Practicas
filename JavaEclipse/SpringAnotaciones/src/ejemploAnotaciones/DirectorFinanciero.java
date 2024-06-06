package ejemploAnotaciones;

import org.springframework.beans.factory.annotation.Value;

/*No usamos la anotación @Component para crear el BEAN.
 * Se establece en el archivo de configuración .CLASS
 */

public class DirectorFinanciero implements Empleados {
	//Campo que apunta a la interfaz de la dependencia
	private CrearInformeFinanciero informe;
	
	//Campos de propiedades
	@Value("${email}")		//Entre comillas, símbolo $ seguido del nombre de la propiedad entre llaves {}
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	
	//Constructor donde se inyecta la dependencia
	public DirectorFinanciero(CrearInformeFinanciero informe) {
		this.informe = informe;
	}

	
	//Métodos GETTERS
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	
	//Métodos implementados de la interfaz propia
	@Override
	public String getTareas() {
		return "Función Director Financiero: Dirigir el departamento financiero";
	}

	@Override
	public String getInforme() {
		return informe.getInformeFinanciero();
	}

}
