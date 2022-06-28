package maximercado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	
	// Registramos JDBC DRiver
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/maximercado";
	
	// Credenciales de la BDD
	static final String USER = "root";
	static final String PASS = "12345";
	
	public Connection conn() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Conectando a la Base de Datos...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Conexion Establecida");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar controlador");
			e.printStackTrace();	
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		return conn;				
	}	
}
	







































/*Connection con;
		public DataBase() {
			
			try {
				Class.forName("com.mysql.jbdc.Driver");
				con = DriverManager.getConnection("jbdc:mysql://localhost:3306/MaxiMercado", "root", "12345");
			}catch(Exception e) {
				System.err.println("Error:" + e);
			}
			
		}
		
		public static void main(String[]args) {
			DataBase cn = new DataBase();
			Statement st;
			ResultSet rs;
			st = 
			
			
		}
}*/
	
