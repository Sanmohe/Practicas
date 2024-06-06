package ioc;

public class DirectorEmpleado implements Empleados {
	//Creación de campo para crear la dependencia (interfaz CreacionInformes)
	private CreacionInformes informeNuevo;
	private String nombreEmpresa, email;  //Creación de campos a inyectar
	
	//Constructor en que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informe) {
		this.informeNuevo = informe;
	}
	
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
	
	
	//Método INIT: Ejecuta tareas antes de que el bean esté disponible
	public void metodoInit() {
		//En este cuerpo se incluyen todas las tareas
		System.out.println("\n Instrucciones iniciales \n");
	}
	
		
	//Método DESTROY: Ejecuta tareas después de que el bean y el contenedor se hayan apagado
	public void metodoDestroy() {
		//En este cuerpo se incluyen todas las tareas
		System.out.println("\n Instrucciones finales \n");
	}
	
	
	@Override
	public String getTareas() {
		return "Función Director: Gestionar la empresa";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	
}
