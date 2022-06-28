package maximercado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Producto {

		public static void main(String []args) {
			DataBase conexion = new DataBase();
			Connection cn = null;
			Statement stmt = null;
			ResultSet rs = null;
			ResultSet rs2 = null;

			
			try {
				cn = conexion.conn();
				stmt = cn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM producto");
		
				System.out.println("============================");
				System.out.println();
				System.out.println(" PRODUCTOS ");
				System.out.println();
				
				while(rs.next()) {
					int idProducto = rs.getInt(1);
					String nombre = rs.getString(2);
					int stock = rs.getInt(3);
					double precio = rs.getDouble(4);
					int descuento = rs.getInt(5);
					String categoria = rs.getString(6);
					
					System.out.println(idProducto + " - " + nombre + " - " + " - " + "$" +  precio + " - " + " - " + categoria);
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (stmt != null) {
						stmt.close();					
					}
					if (cn != null) {
						cn.close();
					}								
			} catch (Exception e2) {
				e2.printStackTrace();
		}
			}		
	}
	
}

