import java.sql.Connection;
import java.sql.DriverManager;

public class Database{
	public Connection DBConnection(Connection cnx) {
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/ludo",
					"ankush","Das@15112001");
			System.out.println("DB Connected");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cnx;
	}
}