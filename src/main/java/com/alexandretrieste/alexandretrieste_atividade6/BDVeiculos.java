/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.alexandretrieste_atividade6;

/**
 *
 * @author xande
 */
public class BDVeiculos {

    private Passeio[] listaPasseio = new Passeio[5];
    private Carga[] listaCarga = new Carga[5];

    public BDVeiculos() {}

    public Passeio[] getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(Passeio[] listaPasseio) {
        this.listaPasseio = listaPasseio;
    }

    public Carga[] getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(Carga[] listaCarga) {
        this.listaCarga = listaCarga;
    }
}
