package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexiones.Conexion;
import entidades.Clubes;
import entidades.Jugadores;


public class DaoClubes {
	//Metodo para sacar lista de equipos
	public ArrayList<Clubes> equipos() throws SQLException   {
		ArrayList<Clubes> listadoclubes = new ArrayList<>();
		Conexion conexion = new Conexion(); 
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			con = conexion.getConexion();
			String ordenSQL="SELECT TEAMID,capacity,stadium.city,TEAMNAME,stadium.stadiumname\n"
					+ " FROM STADIUM,TEAMS\n"
					+ " WHERE stadium.stadiumid = teams.stadium_id\n";
			pst = con.prepareStatement(ordenSQL);
			rs = pst.executeQuery();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				Clubes misclubes = new Clubes();
				misclubes.setTeamId(rs.getInt("TEAMID"));
				misclubes.setTeamName(rs.getString("TEAMNAME"));
				misclubes.setCity(rs.getString("CITY"));
				misclubes.setCapacity(rs.getInt("CAPACITY"));
				misclubes.setStadiumName(rs.getString("STADIUMNAME"));
				listadoclubes.add(misclubes);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (con != null) {
				con.close();
			}
		}
		
return	listadoclubes;
}
	//metodo para la lista de jugadores
	public ArrayList<Jugadores> jugador(int TeamId) throws SQLException   {
		ArrayList<Jugadores> listadojugadores = new ArrayList<>();
		Conexion conexion = new Conexion(); 
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
	
	try {
		con = conexion.getConexion();
		String ordenSQL="SELECT PLAYERID,FIRSTNAME,LASTNAME\n"
				+ "FROM PLAYERS\n"
				+ "WHERE TEAMID=?";
		
		pst = con.prepareStatement(ordenSQL);
		pst.setInt(1, TeamId);
		rs = pst.executeQuery();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		while (rs.next()) {
			Jugadores misjugadores = new Jugadores();
			misjugadores.setPlayerId(rs.getInt("PLAYERID"));
			misjugadores.setFirstName(rs.getString("FIRSTNAME"));
			misjugadores.setLastName(rs.getString("LASTNAME"));
			listadojugadores.add(misjugadores);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {

		if (rs != null) {
			rs.close();
		}
		if (pst != null) {
			pst.close();
		}
		if (con != null) {
			con.close();
		}
	}
	return listadojugadores;
	
	}
	
}
	