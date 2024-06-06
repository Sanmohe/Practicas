package ejemploAnotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//ESTABLECER COMO ARCHIVO DE CONFIGURACIÓN DE SPRING
@Configuration

//INDICAR EL PAQUETE DONDE ESCANEAR LAS ANOTACIONES
@ComponentScan("ejemploAnotaciones")

//CARGAR EL ARCHIVO EXTERNO DE PROPIEDADES
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	//DEFINICIÓN DE BEANS
	@Bean
	public CrearInformeFinanciero informeFinancieroDireccion() {
		return new InformeFinancieroDireccion();
	}

	/* Con la anotación @bean se crea el bean
	 * Crear un método que devuelva el tipo que queremos inyectar, 
	 * en este caso, un InformeFinancieroDireccion
	 * El nombre del método pasará a ser el nombre o ID de Bean para inyectarlo posteriormente.
	 */
	
	
	@Bean
	public DirectorFinanciero directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDireccion());
	}

	/* Con la anotación @bean se crea el bean
	 * Crear un método que devuelva el tipo que queremos inyectar, 
	 * en este caso, un DirectorFinanciero al que se le pasa como dependencia el Bean de un informe financiero.
	 * El nombre del método pasará a ser el nombre o ID de Bean para inyectarlo posteirormente.
	 */
	
}
