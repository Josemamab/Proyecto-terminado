package test;

import java.sql.SQLException;

import dao.DaoFormulario;

public class TestFormulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoFormulario daoformulario = new DaoFormulario();
		
		try {
			daoformulario.iniciosesion("a", "a");
		} catch (SQLException e) {
			System.out.println("error");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
