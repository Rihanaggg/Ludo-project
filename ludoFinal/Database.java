package ludo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




public class Database {

	
	public void insertdata() {
	Connection cnx = null;
	 PreparedStatement stmt = null;
	 try {
		
		 String insert ="insert into redPlayer (redCoin1 , redCoin2 , redCoin3 , redCoin4) values(?,?,?,?)";
		 cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ludo","saisidharthak","root");
		 System.out.println("hello");
		 stmt= cnx.prepareStatement(insert);
		 stmt.setInt(1, Build_Player.pl[0].pa[0].current);
		 stmt.setInt(2, Build_Player.pl[0].pa[1].current);
		 stmt.setInt(3, Build_Player.pl[0].pa[2].current);
		 stmt.setInt(4, Build_Player.pl[0].pa[3].current);
		 stmt.executeUpdate();
		 stmt.close();
		 cnx.close();
	}
	
 catch(Exception e) {
	 e.printStackTrace();
 }

}}
