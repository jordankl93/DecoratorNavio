/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

import br.ifes.edu.poo2.cdp.util.TipoNavio;

/**
 *
 * @author Jordan-Not
 */
public class NavioCargaGeral extends AbstractNavio{

    public NavioCargaGeral() {
        this.tipoNavio = TipoNavio.CARGA_GERAL;
        this.capacidadeCarga = random.nextInt(150);
        this.capacidadePessoa = random.nextInt(12);
    }

    @Override
    public int getCarga() {
        return capacidadeCarga;
    }

    @Override
    public int getPassageiro() {
        return capacidadePessoa;
    }

    @Override
    public void setCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void setPassageiro(int capacidadePessoa) {
        this.capacidadePessoa = capacidadePessoa;
    }

    @Override
    public TipoNavio getTipoNavio() {
        return this.tipoNavio;
    }
    
    @Override
    public void setTipoNavio(TipoNavio tipoNavio) {
        this.tipoNavio = tipoNavio;
    }
}
