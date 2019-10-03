/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Clase
 */
public class consultas extends conexion {
    
    
    
    public boolean autenticacion(String usuario,String contraseña ){
        
        PreparedStatement pst= null;
        ResultSet rs = null; 
        
        try{
            String consulta ="SCRIPT CONSULTA USUARIO Y CONTRASEÑA";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            pst.setString(2,contraseña);
            rs=pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error"+e);
        }finally{
            try{
            if(getConexion() != null) getConexion().close();
            if(pst !=null)pst.close();
            if(rs !=null)rs.close();
            
            }catch(Exception e){
                System.err.println("Error"+e);
            }
        }
        
        return false;
    }
    
    //metodo de prueba
    public static void main(String[] args){
        consultas co= new  consultas();
        System.out.println(co.autenticacion("raul", "1234"));
        
        
    }
    
    

    
}
