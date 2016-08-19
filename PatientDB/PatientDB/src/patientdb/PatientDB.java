package patientdb;

// If using your own PC, download from "dev.mysql.com/downloads/connector/j/"
// Add the MySql jar file to library first
// Found in the "MySql/MySQL Connector J" directory in Program Files.  
import java.sql.*;
import javax.sql.*;

public class PatientDB
{

    public static void main(String args[])
    {
        String dbtime;
        //String dbUrl = "jdbc:mysql://your.database.domain/yourdatabasename";
        String dbUrl = "jdbc:mysql://localhost:3306/PatientDB";
        //String dbClass = "com.mysql.jdbc.Driver";
        String query = "SELECT * FROM patients";

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection (dbUrl, "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) 
            {
                dbtime = rs.getString(1);
                System.out.println(dbtime);
            } 

            con.close();
        } //end try

        catch(ClassNotFoundException e) 
        {
            e.printStackTrace();
        }

        catch(SQLException e) 
        {
            e.printStackTrace();
        }

    }  //end main

}  //end class

