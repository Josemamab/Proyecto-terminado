package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import conexiones.Conexion;
import entidades.*;

public class DaoPartidos {

	public ArrayList<Partidos> encuentros() throws SQLException {
		ArrayList<Partidos> proximospartidos = new ArrayList<Partidos>();
		
		Conexion miconexion = new Conexion();
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String dateformat ="dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat formateadorfecha =  new SimpleDateFormat(dateformat);
		Date fechabd;
		try {
			con = miconexion.getConexion();
			String ordenSQL="select matchdate,\n"
					+ " (select teamname from teams where teamid = matches.hometeamid)as local,\n"
					+ " (select teamname from teams where teamid = matches.awayteamid)as visitante\n"
					+ " from matches,teams\n"
					+ " where teams.teamid = matches.hometeamid\n"
					+ " and matches.matchdate >= sysdate ";
			pst = con.prepareStatement(ordenSQL);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				
				Partidos mispartidos = new Partidos();
				mispartidos.setLocal(rs.getString("LOCAL"));
				mispartidos.setVisitante(rs.getString("VISITANTE"));
				fechabd = rs.getDate("MATCHDATE");
				
				String fechastring = formateadorfecha.format(fechabd);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateformat);
                LocalDateTime localDateTime = LocalDateTime.parse(fechastring, formatter);
				mispartidos.setMatchDate(localDateTime);
				proximospartidos.add(mispartidos);
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
	
		return proximospartidos;
	}
	
	

}
