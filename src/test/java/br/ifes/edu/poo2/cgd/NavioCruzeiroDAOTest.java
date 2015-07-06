/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cgd;

import br.ifes.edu.poo2.cdp.Navio;
import br.ifes.edu.poo2.cdp.util.TipoNavio;
import java.sql.SQLException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jordan-Not
 */
public class NavioCruzeiroDAOTest {
    
    public NavioCruzeiroDAO navioCruzeiroDAO;

	@Before
	public void before() throws ClassNotFoundException, SQLException {
		navioCruzeiroDAO = new NavioCruzeiroDAO();
		this.criarTabelaUsuario();
	}

	 //@Test
	private void criarTabelaUsuario() throws ClassNotFoundException,
			SQLException {

		// Criando a tabela
		navioCruzeiroDAO.criarTabela();
	}

	@Test
	public void salvarUsuario() throws ClassNotFoundException, SQLException {
		Navio navio = navioCruzeiroDAO.create();

		navio.setCarga(0);
		navio.setPassageiro(200);
                navio.setTipoNavio(TipoNavio.CRUZEIRO);

		// inserindo o usuario no banco de dados
		navioCruzeiroDAO.insert(navio);
		Assert.assertNotSame(0, navio.getId());

	}
        
        @Test
	public void updateUsuario() throws ClassNotFoundException, SQLException {
		Navio navio = navioCruzeiroDAO.create();
		navio.setCarga(0);
		navio.setPassageiro(200);
                navio.setTipoNavio(TipoNavio.ESCUNA);
                
		navioCruzeiroDAO.insert(navio);
                
		Navio usuario1 = navioCruzeiroDAO.findbyID(navio.getId());
                navio.setCarga(0);
		navio.setPassageiro(100);
                navio.setTipoNavio(TipoNavio.CRUZEIRO);
                
                navioCruzeiroDAO.update(usuario1);
                
                Navio usuario2 = navioCruzeiroDAO.findbyID(usuario1.getId());
		Assert.assertEquals(usuario1.getId(), usuario2.getId());
	}
       
        @Test
	public void deleteUsuario() throws ClassNotFoundException, SQLException {
		Navio navio = navioCruzeiroDAO.create();
		navio.setCarga(0);
		navio.setPassageiro(200);
                navio.setTipoNavio(TipoNavio.CRUZEIRO);
                
		navioCruzeiroDAO.insert(navio);
                
		Navio usuario1 = navioCruzeiroDAO.findbyID(navio.getId());
                
                navioCruzeiroDAO.delete(usuario1);
                
                Navio usuario2 = navioCruzeiroDAO.findbyID(usuario1.getId());
		Assert.assertEquals(null, usuario2);
	}

	@Test
	public void buscarUsuario() throws ClassNotFoundException, SQLException {
		Navio navio = navioCruzeiroDAO.create();
		navio.setCarga(0);
		navio.setPassageiro(200);
                navio.setTipoNavio(TipoNavio.CRUZEIRO);

		navioCruzeiroDAO.insert(navio);

		Navio usuarioX = navioCruzeiroDAO.findbyID(navio.getId());
		Assert.assertNotNull(usuarioX.getTipoNavio());

	}
        
	@Test
	public void listarUsuarios() throws ClassNotFoundException, SQLException{

		Navio navio = navioCruzeiroDAO.create();
		navio.setCarga(0);
		navio.setPassageiro(200);
                navio.setTipoNavio(TipoNavio.CRUZEIRO);

		navioCruzeiroDAO.insert(navio);
		
		Navio usuario2 = navioCruzeiroDAO.create();
		navio.setCarga(0);
		navio.setPassageiro(150);
                navio.setTipoNavio(TipoNavio.CRUZEIRO);

		navioCruzeiroDAO.insert(usuario2);
		
		List<Navio> usuarios = navioCruzeiroDAO.findAll();
		
		Assert.assertNotNull(usuarios);
		
		Assert.assertNotSame(0, usuarios.size());
	}

}
