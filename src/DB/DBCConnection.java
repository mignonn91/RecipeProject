package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Soft43
 *
 */
public class DBCConnection {
			
	//���� �����ϱ�
	static Connection con = null;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RecipeProject?useSSL=false&allowPublicKeyRetrieval=true";
	static final String USERNAME = "root"; // DB ID
	static final String PASSWORD = "";
	
	/**
	 * DB �����ϱ�
	 */
	public DBCConnection() {
		
		try {
			con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		return con;
	}
	
}
