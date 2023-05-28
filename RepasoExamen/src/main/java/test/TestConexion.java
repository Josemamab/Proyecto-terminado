package test;

import java.sql.Connection;
import java.sql.SQLException;

import conexiones.Conexion;
public class TestConexion {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
    	Conexion conexion = new Conexion();
        Connection con=null;

        try {
            con=conexion.getConexion();
           // Probando.DaoEjemplo miconsulta=new DaoEjemplo();
        //String resultado=    miconsulta.probandoConsulta();

        System.out.println(con);
        con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}