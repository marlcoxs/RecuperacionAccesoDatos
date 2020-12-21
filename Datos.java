/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recuperacionaccesodatos2;

/**
 *
 * @author marcc
 */
public class Datos {
    private String certificado_año;
    private String motivos_solicitud;

    public Datos(String certificado_anio, String motivos_solicitud) {
        this.certificado_año = certificado_anio;
        this.motivos_solicitud = motivos_solicitud;
    }

    Datos() {

    }

    public String getCertificado_anio() {
        return certificado_año;
    }

    public void setCertificado_anio(String certificado_anio) {
        this.certificado_año = certificado_anio;
    }

    public String getMotivos_solicitud() {
        return motivos_solicitud;
    }

    public void setMotivos_solicitud(String motivos_solicitud) {
        this.motivos_solicitud = motivos_solicitud;
    }

    @Override
    public String toString() {
        return "Dato: Año de certificado=" + certificado_año + ", Motivo de la solicitud=" + motivos_solicitud+"\n" ;
    }

}
