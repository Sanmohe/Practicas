package ejemploAnotaciones;

public class InformeFinancieroDireccion implements CrearInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe Financiero de la Dirección";
	}

}
