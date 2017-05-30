import java.sql.Connection;
import java.sql.DriverManager;

public class Prueba_conexion {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String mi_url = "jdbc:mysql://localhost";
			Connection conexion = DriverManager.getConnection(mi_url, "root", "");
			System.out.println("Conexión con mysql establecida");
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con ORACLE -");
			e.printStackTrace();
		}
	}

}