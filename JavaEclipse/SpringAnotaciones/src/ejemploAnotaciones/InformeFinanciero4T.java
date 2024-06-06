package ejemploAnotaciones;

import org.springframework.stereotype.Component;

//CREACIÓN DEL BEAN EN EL CONTENEDOR
@Component
public class InformeFinanciero4T implements CrearInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero Trimestre 4";
	}

}
