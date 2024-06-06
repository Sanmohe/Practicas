package ioc.noFramework;

public class UsuarioMongo implements InterfazUsuario {

	@Override
	public void getInsertaUsuario() {
		System.out.println("Agregando usuario en Mongo");

	}

	@Override
	public void getEliminaUsuario(int ID) {
		System.out.println("Eliminando usuario en Mongo: " + ID);

	}

}
