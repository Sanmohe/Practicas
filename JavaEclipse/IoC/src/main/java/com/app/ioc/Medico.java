package com.app.ioc;

public class Medico {
	Utensilios utensilio;
	
	public void setUtensilio (Utensilios utensilio) {
		this.utensilio = utensilio;
	}
	
	public void operar() {
		System.out.println("Operando...");
		utensilio.usar();
	}
	
	
}
