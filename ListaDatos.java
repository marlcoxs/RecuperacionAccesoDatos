/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recuperacionaccesodatos2;

import java.util.List;

/**
 *
 * @author marcc
 */
class ListaDatos {
    private List<Datos> data;

    public ListaDatos(List<Datos> data) {
        this.data = data;
    }

    public List<Datos> getData() {
        return data;
    }

    public void setData(List<Datos> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ""+data;
    }
    
}
