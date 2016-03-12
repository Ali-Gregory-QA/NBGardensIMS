package DBConnectors;

	public class DatabaseConnector {
		
		public class JDBCconnector {
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:oracle:thin:@localhost:1521/xe";
		static final String USER = "username";
		static final String PASS = "password";
	}

	public void openConnection(String args[]){
		public Connection getConn (String url, String user, String pass) {
			Connection conn = null;
			try {
			OracleDataSource ds = new OracleDataSource();
			ds.setURL(url);
			conn = ds.getConnection(user, pass);
			} catch (SQLException e) {
			e.printStackTrace();
			}
			return conn;
		}
	
	public void closeConnection(String args[]){
		
	}
}
