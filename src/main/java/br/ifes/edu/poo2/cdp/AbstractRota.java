/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

/**
 *
 * @author Jordan-Not
 */
public abstract class AbstractRota extends Rota{
    private Rota rota = new Rota();
    
    public AbstractRota(){
        
    }

    public AbstractRota(Rota rota) {
        this.rota = rota;
    }
    
    @Override
    public String getNome(){
        return rota.getNome() + " -> " + nome;
    }
}
