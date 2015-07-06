/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.Navio;
import java.util.Random;

/**
 *
 * @author Jordan-Not
 */
public class NavioCargaBuilder extends NavioBuilder{
    private Navio navioCarga;
    protected static Random random = new Random();

    public NavioCargaBuilder(Navio navioCarga) {
        this.navioCarga = navioCarga;
    }
    
    @Override
    public void setCarga(){
        navioCarga.setCarga(random.nextInt(200));
    }
    
    @Override
    public void setPassageiro(){
        navioCarga.setPassageiro(random.nextInt(12));
    }

    @Override
    public Navio getNavio() {
        return navioCarga;
    }    
}
