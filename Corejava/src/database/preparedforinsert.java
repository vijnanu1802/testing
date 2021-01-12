package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

class database{
	String url="jdbc:mysql://localhost:3306/madusudhan";
	String username="root";
	String password="root";
	String driver="com.mysql.jdbc.Driver";
	PreparedStatement ps;
	Statement stmt;
	public void connectiondatabase(){
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/madusudhan",username,password);  
			System.out.println("Coneection established");
/*			String quiry="insert into employee values(?,?,?)";
*/			
			String quiry="select * from employee";
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(quiry);
			while(rs.next()){
				System.out.println("values is :"+rs.getString(1)+" "+rs.getString(2));
		}
			/*ps= con.prepareStatement(quiry);
			ps.setInt(1,4);
			ps.setString(2,"arif");
			ps.setString(3,"50000");
			int i=ps.executeUpdate();
			System.out.println(i+"   rows are affected");*/
			 con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class preparedforinsert {
	public static void main(String[] args) {
database d=new database();
d.connectiondatabase();
	}

}
