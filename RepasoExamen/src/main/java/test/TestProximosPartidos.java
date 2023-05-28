package test;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.DaoPartidos;
import entidades.Partidos;

public class TestProximosPartidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaoPartidos daopartidos = new DaoPartidos();
		ArrayList<Partidos> listadopartidos = new ArrayList<Partidos>();
		try {
			listadopartidos = daopartidos.encuentros();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Partidos partidos : listadopartidos) {
			System.out.println(partidos);
			
		}
		
		

	}

}
