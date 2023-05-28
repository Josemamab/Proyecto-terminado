package test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.ForEach;

import dao.DaoClubes;
import entidades.Clubes;


public class TestDaoClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoClubes daoclubes = new DaoClubes();
		ArrayList<Clubes>listadoclubes = new ArrayList<Clubes>();
		try {
			listadoclubes = daoclubes.equipos();

			for (Clubes clubes : listadoclubes) {
				System.out.println(clubes.getTeamId());
				System.out.println(clubes.getTeamName());
				System.out.println(clubes.getCity());
				System.out.println(clubes.getCapacity());
				System.out.println(clubes.getStadiumId());
				System.out.println(clubes.getStadiumName());
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


