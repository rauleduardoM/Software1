/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Clase
 */
public class conexion {
    private String USERNAME="root";
    private String PASSWORD="1234";
    private String HOST="localhost";
    private String PORT="3303";
    private String DATABASE="LuzLuna";
    private String CLASSNAME="com.mysql.jdbc.Driver"; 
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con ;

    public conexion() {
        try {
            Class.forName(CLASSNAME);
           con = DriverManager.getConnection(URL, URL, PASSWORD);
            
        }catch(ClassNotFoundException e){
            System.err.println("ERROR"+ e);
        }catch(SQLException e){
            System.err.println("ERROR"+ e);
            
        }
     }
    public Connection getConexion(){
        return con;
    }
    public static void main (String[] arg){
        conexion con = new conexion();
    }
    
    
    
    
    
}
