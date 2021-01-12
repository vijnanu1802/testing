package database;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
class photoupdate{
	String url="jdbc:mysql://localhost:3306/madusudhan";
	String username="root";
	String password="root";
	String driver="com.mysql.jdbc.Driver";
	PreparedStatement ps;
	Statement stmt;
	FileInputStream is;
	String f="C:/Users/yerraguntla.r/Desktop/write-clob-using-java-jdbc.png";
	public void connectiondatabase(){
		try {
			File filepath=new File(f);
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);  
			System.out.println("Coneection established");
			String quiry="insert into photoup(name,photo) values(?,?)";
			ps= con.prepareStatement(quiry);
			ps.setString(1,"madhu");
			is = new FileInputStream(filepath);
			ps.setBinaryStream(2,(InputStream)is, (int)(filepath.length()));
			int i=ps.executeUpdate();
			System.out.println(i+"   rows are affected");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class photodatabase {
	public static void main(String[] args) {
		photoupdate d=new photoupdate();
		d.connectiondatabase();
	}
}
