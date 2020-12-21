/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recuperacionaccesodatos2;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 *
 * @author marcc
 */
public class ClasePrincipal{
     static String ruta="https://datos.comunidad.madrid/";
    
    public static void main(String[] args) {
        
    
    
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ruta).addConverterFactory(GsonConverterFactory.create())
                .build();

        ServicioPedirDatos servicio = retrofit.create(ServicioPedirDatos.class);
        Call<ListaDatos> llamada=servicio.listRepos();
        llamada.enqueue(new Callback<ListaDatos>() {
            @Override
            public void onResponse(Call<ListaDatos> call, Response<ListaDatos> response) {
                
                ListaDatos lista_datos = response.body();
                for (Datos d : lista_datos.getData()) {
                    String certificado_año=d.getCertificado_anio();
                    String motivos_solicitud=d.getMotivos_solicitud();
                    Datos objeto_dato=new Datos(certificado_año,motivos_solicitud);
                    AccesoBD.grabarDatos(objeto_dato);
                    String tabla_html = AccesoFichero.grabarDatos(objeto_dato,lista_datos);
                }
                
                
                
                
               

            }

            @Override
            public void onFailure(Call<ListaDatos> call, Throwable t) {

            }
        });
    }
    
    
}

