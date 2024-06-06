package ioc.noFramework;

public class UsuarioFactory {
	//MÉTODOS IMPLEMENTADOS SIN IOC
	/*
	public void getInsertaUsuario() {
		System.out.println("Agregando usuario");
	}
		
	public void getEliminaUsuario (int ID) {
		System.out.println("Eliminando usuario " + ID);
	}
	*/
	
	
	// MODIFICACIONES PARA APLICAR IOC Y DI:
	
	InterfazUsuario usuario;	//Creación de atributo que apunte directamente a la interfaz
	
	public UsuarioFactory(InterfazUsuario usuario) {	//Creación del constructor inyectando el atributo que apunta a la interfaz
		this.usuario = usuario;
	}
	
		
	public void getInsertaUsuario() {	//Implementación del método llamando a la interfaz
		usuario.getInsertaUsuario();
	}
	
	public void getEliminaUsuario (int ID) {
		usuario.getEliminaUsuario(ID);
	}
	
	
	
}
