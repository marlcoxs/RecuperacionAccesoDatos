/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recuperacionaccesodatos2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcc
 */
class AccesoFichero {
static String ruta="C:\\Marcos\\datos.html";

    static String grabarDatos(Datos objeto_dato, ListaDatos lista_datos) {
        try {
        FileWriter fw=new FileWriter(ruta, false);
        String linea="<html><table border=1px><tr><th height='20px' width='50px'>Año de certificado</th><th height='20px' width='50px'>Motivo de solicitud</th></tr>";
           for (Datos d: lista_datos.getData()){
               
               linea+="<tr><td height='20px' width='50px'>"+d.getCertificado_anio()+"</td><td height='20px' width='50px'>"+d.getMotivos_solicitud()+"</td></tr>";
           }
           linea+="</table>";
           
        
        fw.write(linea);
        fw.close();
        
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
           return null;
        
    }
    
}