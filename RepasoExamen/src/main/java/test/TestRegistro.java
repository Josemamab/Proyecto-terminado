package test;

import java.sql.SQLException;

import dao.DaoFormulario;
import excepciones.ExamenException;

public class TestRegistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			
			DaoFormulario daoformulario = new DaoFormulario();
			
			try {
				daoformulario.registrousuario("LUIS","LUIS",1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error sql");
				e.printStackTrace();
			} catch (ExamenException e) {
				// TODO Auto-generated catch block
				System.out.println("error global");
				e.printStackTrace();
			} 
		}

	}


