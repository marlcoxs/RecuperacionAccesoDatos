/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recuperacionaccesodatos2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author marcc
 */
public class AccesoBD {

     public static void grabarDatos(Datos d) {
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/datos?serverTimezone=UTC", "root", "");
		Statement stmt=con.createStatement();
                
                
               String sql="INSERT INTO `datosjson`(`certificado_año`, `motivos_solicitud`) VALUES ('"+d.getCertificado_anio()+"','"+d.getMotivos_solicitud()+"')";
		stmt.executeUpdate(sql);

            

				//column count doesn´t match row count
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
    
}
    

