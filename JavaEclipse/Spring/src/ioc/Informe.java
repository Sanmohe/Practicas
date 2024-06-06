package ioc;

public class Informe implements CreacionInformes {
	//La clase capaz de crear la "dependencia"
	//Define el método común que las clases dependientes deben incorporar
	
	@Override
	public String getInforme() {
		return "INFORME";
	}

	
}
