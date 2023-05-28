package test;

import aprendiendoJava.primermetodo;

public class probandoinicioprogramacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String variabledesaludo = "hola";
		System.out.println(variabledesaludo);
		
		
		primermetodo metodo = new primermetodo();
		System.out.println(metodo.saludo());
		
		variabledesaludo = metodo.saludo();
		System.out.println(variabledesaludo);
	}


}
