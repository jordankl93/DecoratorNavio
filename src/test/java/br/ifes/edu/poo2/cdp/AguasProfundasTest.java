/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jordan-Not
 */
public class AguasProfundasTest {
    public Rota aguasProfundas;
    
    public AguasProfundasTest() {
    }
    
    @Before
    public void before(){
        aguasProfundas = new AguasProfundas();
    }
    
    @Test
    public void getNome(){
        Assert.assertEquals(" -> Aguas Profundas", aguasProfundas.getNome());
        System.out.println(aguasProfundas.getNome());
        
        aguasProfundas = new AguasLitoraneas(aguasProfundas);
        
        Assert.assertEquals(" -> Aguas Profundas -> Aguas Litoraneas", aguasProfundas.getNome());
        System.out.println(aguasProfundas.getNome());
    } 
    
}
