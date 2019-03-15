package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DemoClass {
	public static void main(String args[]){
		try {
			Class.forName("org.h2.Driver");
			Connection co=  DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			Statement statement= co.createStatement();
			ResultSet result=statement.executeQuery("select * from CATEGORY");
			
			while(result.next())
			{
				System.out.print(result.getInt(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				
				
			}
			
			statement.close();
			co.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}


	
		
		
		
		
	
	}


