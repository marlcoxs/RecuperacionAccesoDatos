/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recuperacionaccesodatos2;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author marcc
 */
public interface ServicioPedirDatos {
    @GET("catalogo/dataset/24f925a1-335d-4ea5-b947-feed4c61573c/resource/0f4f7925-826e-408b-a2e8-bb30ff8912d8/download/uniones_hecho_certificados.json")
    Call<ListaDatos> listRepos();
}
