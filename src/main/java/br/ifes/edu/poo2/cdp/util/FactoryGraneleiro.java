/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.Navio;
import br.ifes.edu.poo2.cdp.NavioGraneleiro;

/**
 *
 * @author Jordan-Not
 */
public enum FactoryGraneleiro implements FactoryNavio{
    FACTORY_GRANELEIRO;
    
    private Navio graneleiro;

    @Override
    public synchronized Navio criarNavio() {
        if(graneleiro == null){
            graneleiro = new NavioGraneleiro();
            return graneleiro;
        }
        return (Navio) graneleiro.clone();
    }
}
