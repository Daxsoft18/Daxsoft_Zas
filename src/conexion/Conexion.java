
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daxsoft.conexion;

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

public class DatosConexion {
    /* Modifcar de acuerdo a las credenciales root de Mysql local mientras 
        se proporcionan las originales */
    private static final String db = "sgae";
    private static final String user = "root";
    private static final String pass = "Dax51212";
    
   public  DatosConexion() {
        
   }
   
   public String getDb() {
       return db;
   }
    
   public String getUser() {
       return user;
   }
    
   public String getPass() {
       return pass;
   }
}
