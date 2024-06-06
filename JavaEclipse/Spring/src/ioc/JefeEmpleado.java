package ioc;

public class JefeEmpleado implements Empleados {
	private CreacionInformes informeNuevo;
	private String nombreEmpresa, email;  //Creación de campos a inyectar
	
	
	//Métodos SET y GET de los campos
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	
	@Override
	public String getTareas() {
		return "Función Jefe: Gestionar los empleados de la sección";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Jefe: " + informeNuevo.getInforme();
	}
	
}
