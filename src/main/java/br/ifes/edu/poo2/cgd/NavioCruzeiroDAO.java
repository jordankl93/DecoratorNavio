/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cgd;

import br.ifes.edu.poo2.cdp.Navio;
import br.ifes.edu.poo2.cdp.util.FactoryMethodNavio;
import br.ifes.edu.poo2.cdp.util.TipoNavio;

/**
 *
 * @author Jordan-Not
 */
public class NavioCruzeiroDAO extends NavioDAO{
    
    public Navio create(){
        return FactoryMethodNavio.criarNavio(TipoNavio.CRUZEIRO);
    }
    
}
