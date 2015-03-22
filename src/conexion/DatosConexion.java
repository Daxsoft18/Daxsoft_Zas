/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daxsoft.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @etiqueta ListParts 
 * @package     daxsoft.conexion
 * @subpackage  ""
 * @link        www.daxsoft.com 
 * @license     ""
 * @since       1.0
 * @version     $Revision: 1 $
 * @author	Martinez Hernandez Fernando Ivan
 * @version	23/03/15  version 1.0
 * @Software  NeatBeans && Sublime Text
 * @Copyright (c) 2015, Martinez Hernandez Fernando Ivan
		Todos los derechos reservados.
 */
public class Conexion {
    
    private DatosConexion dc;
    private Statement coman;
    public Connection conexion;
    
    public Conexion() throws SQLException {
        conection();
    }
    
    
    private void conection() throws SQLException {
        try {
            dc = new DatosConexion();
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/"+dc.getDb(),dc.getUser(),dc.getPass());
          //JOptionPane.showMessageDialog(null,"Se conecto");
        } catch(SQLException ex){
          JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
   
    public Connection getConecction() {
        return conexion;
    }
    
    public void closeConection() throws SQLException {
        try {
            conexion.close();
            } catch(SQLException ex){
          JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
}
