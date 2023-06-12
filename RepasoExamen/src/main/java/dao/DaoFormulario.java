package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexiones.Conexion;
import excepciones.ExamenException;

public class DaoFormulario {
	//Metodo para iniciar sesion
	public void iniciosesion(String usuario, String contrasenia) throws SQLException {

		Conexion miconexion = new Conexion();

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String ordenSQL = "select username\n" + " from users\n" + " where username =?\n" + " and passuser =?";

		con = miconexion.getConexion();
		pst = con.prepareStatement(ordenSQL);
		pst.setString(1, usuario);
		pst.setString(2, contrasenia);
		rs = pst.executeQuery();

		if (rs.next()) {
			System.out.println("usuario y contraseña correctos");
		} else {
			throw new SQLException();

		}

	}
	//metodo para registro de usuarios
	public void registrousuario(String usuario, String contrasenia, int equipo) throws SQLException, ExamenException {
		Conexion miconexion = new Conexion();

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String ordenSQL = "select username\n" + " from users\n" + " where username =?\n" + " and passuser =?";

		con = miconexion.getConexion();
		pst = con.prepareStatement(ordenSQL);
		pst.setString(1, usuario);
		pst.setString(2, contrasenia);
		rs = pst.executeQuery();

		if (rs.next()) {
			throw new SQLException();
		}

		ordenSQL = "INSERT INTO USERS (USERNAME,PASSUSER,IDUSER,FIRSTTEAM) VALUES(?,?,ID_USER.NEXTVAL,?)";

		pst = con.prepareStatement(ordenSQL);
		pst.setString(1, usuario);
		pst.setString(2, contrasenia);
		pst.setInt(3, equipo);
		rs = pst.executeQuery();

		if (rs.next()) {
			System.out.println("El usuario se  ha insertado correctamente");
		} else {
			throw new ExamenException();
		}
	}

}
