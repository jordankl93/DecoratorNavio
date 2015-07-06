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
public class NavioPassageiroBuilder extends NavioBuilder{
    private Navio navioPassageiro;
    protected static Random random = new Random();

    public NavioPassageiroBuilder(Navio navioPassageiro) {
        this.navioPassageiro = navioPassageiro;
    }
    
    @Override
    public void setCarga(){
        navioPassageiro.setCarga(0);
    }
    
    @Override
    public void setPassageiro(){
        navioPassageiro.setPassageiro(random.nextInt(200));
    }

    @Override
    public Navio getNavio() {
        return navioPassageiro;
    }
}
