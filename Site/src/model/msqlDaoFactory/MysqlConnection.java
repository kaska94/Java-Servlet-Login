package model.msqlDaoFactory;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MysqlConnection {
	public static MysqlConnection instance = new MysqlConnection();
	
	private static Connection connection;
	private static Context initCtx;
	private static Context envCtx;
	private static DataSource ds ;
	
	private MysqlConnection() {
	}

	public static MysqlConnection getInstance() {
		return instance;
	}
	public static void connect() {
		if (connection != null) {
			return;
		}
		try {
			initCtx =   new InitialContext();
			envCtx = (Context) initCtx.lookup
					("java:comp/env");
			ds = (DataSource) envCtx.lookup
					("jdbc/student");

			
			connection = ((DataSource) ds).getConnection();
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void disconect() {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		connection = null;
	}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

	public static void setConnection(Connection connection) {
		MysqlConnection.connection = connection;
	}
}
