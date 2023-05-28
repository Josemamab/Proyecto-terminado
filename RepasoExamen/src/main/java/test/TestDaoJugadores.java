package test;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.DaoClubes;
import entidades.Jugadores;

public class TestDaoJugadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoClubes daoclubes = new DaoClubes();
		ArrayList<Jugadores>listadojugadores = new ArrayList<Jugadores>();
		try {
			listadojugadores = daoclubes.jugador(1);

			for (Jugadores jugadores : listadojugadores) {
				System.out.println(jugadores.getFirstName());
				System.out.println(jugadores.getLastName());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	}


