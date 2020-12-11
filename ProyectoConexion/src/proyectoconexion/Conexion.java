/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author leoth
 */
public class Conexion {
    
     Connection conexion = null;
    String pass = "leito123";
    String user = "postgres";
    
    
public void Conectarme (){
    
    try{
        conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EmpresaXYZ",user, pass);
        JOptionPane.showMessageDialog(null, "Conectado con exito");
        
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }
}

public void Ingreso(String script){
    PreparedStatement p = null;
    ConectarmeV2();
    
    try{
        p = conexion.prepareStatement(script);
        p.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos han sido ingresados correctamente a PostgreSQL");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
}



public void ConectarmeV2 (){
    
    try{
        conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EmpresaXYZ",user, pass);
        //JOptionPane.showMessageDialog(null, "Conectado con exito");
        
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }
}

}
    

