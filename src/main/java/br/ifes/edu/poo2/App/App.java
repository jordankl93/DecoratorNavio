/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.App;

import br.ifes.edu.poo2.cdp.util.FactoryMethodNavio;
import br.ifes.edu.poo2.cdp.Navio;
import br.ifes.edu.poo2.cdp.util.TipoNavio;

/**
 *
 * @author Jordan-Not
 */
public class App {
    
    public static void main(String[] args){
        Navio navio = FactoryMethodNavio.criarNavio(TipoNavio.CRUZEIRO);
        
        System.out.println(navio.toString());        
    }    
    
}
