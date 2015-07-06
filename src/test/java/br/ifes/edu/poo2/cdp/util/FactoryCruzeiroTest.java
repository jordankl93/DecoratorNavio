/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.util.FactoryCruzeiro;
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
public class FactoryCruzeiroTest {
    
    public FactoryCruzeiroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of valueOf method, of class FactoryCruzeiro.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        FactoryCruzeiro expResult = FactoryCruzeiro.FACTORY_CRUZEIRO;
        FactoryCruzeiro result = FactoryCruzeiro.FACTORY_CRUZEIRO;
        assertEquals(expResult, result);
    }
    
}
