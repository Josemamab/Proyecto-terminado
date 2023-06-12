package test;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.jasper.tagplugins.jstl.ForEach;

import dao.DaoClubes;
import entidades.Clubes;

public class TestListadoEquipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoClubes daoclubes = new DaoClubes();
		
		ArrayList<Clubes> lista = new ArrayList<Clubes>();
		
		
		
		try {
			lista = daoclubes.listadoequipos();
			for (Clubes clubes : lista) {
				System.out.print(clubes.getTeamId());
				System.out.println(clubes.getTeamName());
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
