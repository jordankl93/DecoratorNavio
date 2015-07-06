/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

import br.ifes.edu.poo2.cdp.reuse.Model;
import br.ifes.edu.poo2.cdp.util.TipoNavio;
import java.util.Random;

/**
 *
 * @author Jordan-Not
 */
public abstract class AbstractNavio implements Navio {

    protected long id;
    protected int capacidadePessoa;
    protected int capacidadeCarga;
    protected TipoNavio tipoNavio;
    protected static Random random = new Random();

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException x) {
            System.out.println(x.getMessage());
        }

        return obj;
    }

    @Override
    public String toString() {
        return "Quantidade de passageiros: " + getPassageiro() + " | Quantidade Carga: " + getCarga() + " Toneladas";
    }

}
