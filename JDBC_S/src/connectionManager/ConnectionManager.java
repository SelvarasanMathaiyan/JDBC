package connectionManager;

import java.sql.*;

public class ConnectionManager {

	Connection con = null;
	
	public Connection establishConnection() throws ClassNotFoundException, SQLException
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		con =(Connection) DriverManager.getConnection
				("jdbc:mysql://localhost:3306/selva",
				"root","root");
		
		return con;
	}
	public void closeConnection() throws SQLException
	{
		con.close();
	}
}
