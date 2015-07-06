/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.Navio;
import br.ifes.edu.poo2.cdp.NavioGraneleiro;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class NavioCargaBuilderTest {
    private NavioBuilder navioCargaBuilder;
    
    @Before
    public void before() {
    }
    
    /**
     * Test of setCarga method, of class NavioCargaBuilder.
     */
    @Test
    public void testSetCarga() {
        System.out.println("setCarga");
        Navio navioGraneleiro = new NavioGraneleiro();
        navioCargaBuilder = new NavioCargaBuilder(navioGraneleiro);
        navioCargaBuilder.setCarga();
        
        if(navioGraneleiro.getCarga() > 200)
            fail("Erro. Quantidade de carga superior ao permitido");
    }

    /**
     * Test of setPassageiro method, of class NavioCargaBuilder.
     */
    @Test
    public void testSetPassageiro() {
        System.out.println("setPassageiro");
        Navio navioGraneleiro = new NavioGraneleiro();
        navioCargaBuilder = new NavioCargaBuilder(navioGraneleiro);
        navioCargaBuilder.setPassageiro();
        Assert.assertNotNull(navioCargaBuilder.getNavio().getPassageiro());
    }

    /**
     * Test of getNavio method, of class NavioCargaBuilder.
     */
    @Test
    public void testGetNavio() {
        System.out.println("getNavio");
        Navio expResult = new NavioGraneleiro();
        NavioCargaBuilder instance = new NavioCargaBuilder(expResult);
        Navio result = instance.getNavio();
        assertEquals(expResult.getClass(), result.getClass());
    }
    
}
