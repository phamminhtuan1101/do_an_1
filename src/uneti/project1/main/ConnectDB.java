
package uneti.project1.main;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDB {
    public static Connection getConnection(){
    Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBH;"
                    + "user=sa;password=Tuan_110103;encrypt=false");
            if(conn != null){
                System.out.println("Ket noi thanh cong");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}



