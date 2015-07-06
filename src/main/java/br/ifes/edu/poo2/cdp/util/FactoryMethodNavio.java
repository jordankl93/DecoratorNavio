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
public class FactoryMethodNavio {

    public static Navio criarNavio(TipoNavio tipoNavio) {
        FactoryNavio fabricaNavio;
        NavioBuilder builder;
        NavioDiretor diretor;

        if (tipoNavio.equals(TipoNavio.CARGA_GERAL)) {
            fabricaNavio = FactoryCargaGeral.FACTORY_CARGA_GERAL;
            builder = new NavioCargaBuilder(fabricaNavio.criarNavio());
            diretor = new NavioCargaDiretor();
        } else if (tipoNavio.equals(TipoNavio.GRANELEIRO)) {
            fabricaNavio = FactoryGraneleiro.FACTORY_GRANELEIRO;
            builder = new NavioCargaBuilder(fabricaNavio.criarNavio());
            diretor = new NavioCargaDiretor();
        } else if (tipoNavio.equals(TipoNavio.CRUZEIRO)) {
            fabricaNavio = FactoryCruzeiro.FACTORY_CRUZEIRO;
            builder = new NavioPassageiroBuilder(fabricaNavio.criarNavio());
            diretor = new NavioPassageiroDiretor();
        } else {
            fabricaNavio = FactoryEscuna.FACTORY_ESCUNA;
            builder = new NavioPassageiroBuilder(fabricaNavio.criarNavio());
            diretor = new NavioPassageiroDiretor();
        }     
        
        return diretor.build(builder);
    }

}
