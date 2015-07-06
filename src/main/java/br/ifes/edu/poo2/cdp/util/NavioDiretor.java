/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.Navio;

/**
 *
 * @author Jordan-Not
 */
public interface NavioDiretor {
    public Navio build(NavioBuilder builder);
}
