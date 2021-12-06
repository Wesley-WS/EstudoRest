package br.com.filipe.facade;

import br.com.filipe.dao.ListarDao;
import br.com.filipe.dao.ListarDaoImpl;

public class ListarFacadeImpl implements ListarFacade {

	private ListarDao listarDaoImpl = new ListarDaoImpl();
	
	@Override
	public void listar() throws Exception {
		listarDaoImpl.listar();
		//return null;
	}
	
}
