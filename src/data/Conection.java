/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author Ascencio
 */
import java.sql.*;


public class Conection {
    //variables de tipo estaticas de conexion a mysql
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //El puerto es opcional
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/mediateca?useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "";
    private static Driver driver = null;
 
    
    //metodo para obtener la conexion con el uso de synchronized
    public static synchronized Connection getConnection() throws SQLException {
        if(driver == null){   
        try {
            //se registra el driver
            Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
            driver = (Driver) jdbcDriverClass.newInstance();
            DriverManager.registerDriver(driver);
        } catch (Exception e) {
            System.out.println("Error al cargar el driver JDBC");
            e.printStackTrace();
        }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER,JDBC_PASS);
    }
    
    //metodo para cierre del resulset
    public static void close(ResultSet rs){
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException sqle) {
        sqle.printStackTrace();
        }
    }
    
    //cierre del prepare statement
    public static void close(Statement stmt){
        try {
            if(stmt !=  null){
                stmt.close();
        }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    //cierre de la conexion
    public static void close(Connection conn){
        try {
            if(conn !=  null){
                conn.close();
        }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
