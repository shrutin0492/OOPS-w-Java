import java.sql.*;
import java.io.*;

class JDBCdynamicstatement
 {
	public static void main(String[] args)
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver"); //forname method throws an exception
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/javasql";
			String uname="root";
			String pass="dsu@22";
			
			Connection con=DriverManager.getConnection(url, uname, pass);//cannot create the object for connection interface
			
			//create a query
			String q="insert into table1(tName, tCity) values (?,?)";

			//get the PreparedStatement Object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name :");
			String name=br.readLine();

			System.out.println("Enter city :");
			String city=br.readLine();

			//Set the values to the query
			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();

			System.out.println("inserted...");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
