package coreservlet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DButil {
	private static Connection connection;
	private ResultSet resultset;
	
	// Open Connection to database
	public void connectDB(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("JDBC Driver loaded. Connecting to database....");
			connection = DriverManager.getConnection("jdbc:sqlserver://s16988308.onlinehome-server.com:1433;"
					+ "databaseName=CUNY_DB;integratedSecurity=false;", "cst4713", "password1");
			System.out.println("Database Connected.");
		}catch(ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		}
	}
	
	// Run Query to get result set
	public ResultSet getQuery(String query) throws SQLException, ClassNotFoundException {
		
		try{
			//connectDB();
			Statement statement = connection.createStatement();
			setResultset(statement.executeQuery(query));
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
		return getResultset();
	}
		
	// Closes database connection
	public void closeConn() throws SQLException{

		connection.close();
	}

	public ResultSet getResultset() {
		return resultset;
	}

	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}
	
	public List<String> getId (){
	    List<String> id = new ArrayList<>();
		String query = "select ssn from dbo.Students;";
		try{
			//connectDB();
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(query);

			while (resultset.next()){
				id.add(resultset.getString("ssn"));
			}
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		return id;
	}
}