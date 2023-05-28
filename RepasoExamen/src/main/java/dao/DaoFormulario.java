package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexiones.Conexion;

public class DaoFormulario {

	public void iniciosesion(String usuario, String contrasenia) throws SQLException {
		
		Conexion miconexion = new Conexion();
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		String ordenSQL="select username\n"
				+ " from users\n"
				+ " where username =?\n"
				+ " and passuser =?";
		
			
			con = miconexion.getConexion();
			pst = con.prepareStatement(ordenSQL);
			pst.setString(1, usuario);
			pst.setString(2, contrasenia);
			rs=pst.executeQuery();
			
			if (rs.next()) {
				System.out.println("usuario y contraseña correctos");
			}else {
				throw new  SQLException();	
				
			
			}

	}
}
