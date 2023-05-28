package conexiones;
	import java.sql.Connection;
	import java.sql.DatabaseMetaData;
	import java.sql.SQLException;
	import java.util.Properties;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	//import conexiones.Conexion;
	import oracle.jdbc.OracleConnection;
	import oracle.jdbc.pool.OracleDataSource;

	public class Conexion {

		public Conexion() {
			
		}
		   /* 
		      Conexion a la base de datos de Oracle Cloud usando Wallet:
				1. 	Descargar el Wallet(cartera de credenciales) y situarlo en un
					directorio. En este ejemplo está en:
					D:/OracleCloudWallets/ortprofesor
				2.  Descomprimir el archivo Wallet.
				
				3. Incluir las librerias oraclepki.jar, osdt_core.jar y osdt_cert.jar
				   en vuestro proyecto.
				4. Hay que usar la clase oracle.jdbc.OracleConnection;
				   oracleconnection= (OracleConnection) ods.getConnection();
				   
				5. Hacemos después un casting para retornar un java.sql.Connection.
				   
			*/
		   public Connection getConexion() throws SQLException{
			   final  String DB_URL="jdbc:oracle:thin:@practicaexamen_high?TNS_ADMIN=C:/Wallet_PracticaExamen";
			   final  String DB_USER = "ADMIN";
			   final  String DB_PASSWORD = "ClasesRepasoEsteban3";
			   
			   Properties info = new Properties();     
			    info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, DB_USER);
			    info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, DB_PASSWORD);          
			    info.put(OracleConnection.CONNECTION_PROPERTY_DEFAULT_ROW_PREFETCH, "20");    
			  

			    OracleDataSource ods = new OracleDataSource();
			    ods.setURL(DB_URL);    
			    ods.setConnectionProperties(info);

			    // With AutoCloseable, the connection is closed automatically.
			    try {
			    		OracleConnection connection = (OracleConnection) ods.getConnection();
			      // Get the JDBC driver name and version 
			      DatabaseMetaData dbmd = connection.getMetaData();       
			      System.out.println("Driver Name: " + dbmd.getDriverName());
			      System.out.println("Driver Version: " + dbmd.getDriverVersion());
			      // Print some connection properties
			      System.out.println("Default Row Prefetch Value is: " + 
			         connection.getDefaultRowPrefetch());
			      System.out.println("Database Username is: " + connection.getUserName());
			      System.out.println();
			      // Perform a database operation 
			     // printEmployees(connection);
		        return connection; 
			    }catch (Exception e) {
					// TODO: handle exception
			    	System.out.print(e);
				}
				return null;			

		   }}