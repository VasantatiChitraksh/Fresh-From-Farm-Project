import java.sql.*;
import java.util.Scanner;

public class Jdbc {
    public static void main(String[] args) throws SQLException {

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6691354",
                    "sql6691354",
                    "tPUdQnpmFF"
            );
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM login_info");

            Scanner in =new Scanner(System.in);
            while(resultSet.next())
            {
                System.out.println(resultSet.next());

                    System.out.println("UID is " + resultSet.getInt("UID"));
                  //  System.out.println("Password is "+resultSet.getString("Password"));


            }


    }
}