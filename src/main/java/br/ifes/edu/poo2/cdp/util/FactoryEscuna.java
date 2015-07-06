/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.Navio;
import br.ifes.edu.poo2.cdp.NavioEscuna;

/**
 *
 * @author Jordan-Not
 */
public enum FactoryEscuna implements FactoryNavio{
    FACTORY_ESCUNA;
    
    private Navio escuna;
    
    @Override
    public synchronized Navio criarNavio() {
        if(escuna == null){
            escuna = new NavioEscuna();
            return escuna;
        }
        return (Navio) escuna.clone();
    }
}
