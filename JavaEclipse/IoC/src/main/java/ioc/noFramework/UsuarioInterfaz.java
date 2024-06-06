package ioc.noFramework;

public class UsuarioInterfaz implements InterfazUsuario {

	@Override
	public void getInsertaUsuario() {
		System.out.println("Agregando usuario en Oracle");

	}

	@Override
	public void getEliminaUsuario(int ID) {
		System.out.println("Eliminando usuario en Oracle: " + ID);

	}

}
