package Default;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

        public static void main(String[] args) throws SQLException {
           System.out.println("Hello, World!");
       //Class.forName("com.mysql.jdbc.Driver");
       
       DriverManager.getConnection("jdbc:mysql://localhost/Northwind", "root", "");
       System.out.println("Conectado !!!");


        }
}