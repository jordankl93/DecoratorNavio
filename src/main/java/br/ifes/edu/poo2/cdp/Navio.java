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
public interface Navio extends Cloneable{    
    
    public long getId();
    public int getCarga();
    public int getPassageiro();
    public TipoNavio getTipoNavio();
    public void setId(long id);
    public void setCarga(int capacidadeCarga);
    public void setPassageiro(int capacidadePessoa);
    public void setTipoNavio(TipoNavio tipoNavio);
    
    public Object clone();    
}
