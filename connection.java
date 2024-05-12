package stage;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	private static Connection connection;
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Stage","root","");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return connection;
	}


}
