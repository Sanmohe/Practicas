package ioc;

public class SecretarioEmpleado implements Empleados {
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

	
	
	/*
	public SecretarioEmpleado(CreacionInformes informeNuevo) {
	this.informeNuevo = informeNuevo;
	}
	*/
	
	//Método Setter que inyecta la dependencia (alternativa al constructor)
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	

	@Override
	public String getTareas() {
		return "Función del Secretario: Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Secretario: " + informeNuevo.getInforme();
	}

}
