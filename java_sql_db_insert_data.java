package new_java;

import java.sql.*;
public class java_sql_db_insert_data {
    public static void main(String[] args){
          try{
        	  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
              Connection connection= DriverManager.getConnection("jdbc:ucanaccess://E:\\Database\\ICE_PUST.accdb");//Establishing Connection
             System.out.println("Connected Successfully");
              //Crating PreparedStatement object
              PreparedStatement preparedStatement=connection.prepareStatement(""
              		+ "INSERT INTO Student(Name,Email,Phone) VALUES (?, ?, ?)");
              //Setting values for Each Parameter
              preparedStatement.setString(1, "Mizan");
              preparedStatement.setString(2, "mizan.ru@gmail.com");
              preparedStatement.setString(3, "01722633140");
              //Executing Query
              preparedStatement.executeUpdate();
              System.out.println("data inserted successfully");
 
          }catch(Exception e){
              System.out.println("Error in connection");
 
          }
 
    }
}