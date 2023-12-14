import java.sql.*;
import java.util.*;


public class JDBCcallablestatement
 {
	public static void main(String[] args)
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver"); 
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/javasql";
			String uname="root";
			String pass="dsu@22";
			Connection con=DriverManager.getConnection(url, uname, pass);//cannot create the object for connection interface
			
			CallableStatement cs=con.prepareCall("{call callableStmtSP(?,?,?)}");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter tId");
			int a=sc.nextInt();
			
			System.out.println("Enter tName");
			String b=sc.next();	
			
			System.out.println("Enter tCity");
			String c=sc.next();
			
			cs.setInt(1,a);
			cs.setString(2, b);
			cs.setString(3, c);
			
			cs.execute();
			con.close();			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
