package ioc.noFramework;

public class App {
	
	public static void main (String[] args) {
		/*
		 * Aquí no se aplica IoC ni DI. Las instancias (objetos) son dependientes de la clase UsuarioFactory.
		 * Si hubiera mas componentes que instancien objetos de esta clase, habría que cambiar la sinstancias una por una.		
		*/
		
		/*
		UsuarioFactory objeto = new UsuarioFactory();
		objeto.getInsertaUsuario();
		objeto.getEliminaUsuario(1);
		*/
		
		
		/*
		 * A partir de aquí se aplica IoC y se inyectan dependencias
		 */
		
		UsuarioFactory objeto1 = new UsuarioFactory(new UsuarioInterfaz());  
		//Se le pasa como parámetro una instancia de la clase que extiende la interfaz
		//Aquí es donde se ha inyectado la dependencia
		objeto1.getInsertaUsuario();
		objeto1.getEliminaUsuario(1);
		
		//Si ahora se quiere crear el objeto con otra dependencia:
		UsuarioFactory objeto2 = new UsuarioFactory(new UsuarioMongo());  
		objeto2.getInsertaUsuario();
		objeto2.getEliminaUsuario(1);
		
		//Solo cambiando la inyección, no hay que modificar las clases.
		
		
		
	}

}
