package br.com.filipe.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.filipe.dao.ListarDao;
import br.com.filipe.dao.ListarDaoImpl;

@Service
public class ListarFacadeImpl implements ListarFacade {

	@Autowired
	private ListarDao listarDaoImpl;
	
	@Override
	public void listar() throws Exception {
		listarDaoImpl.listar();
		//return null;
	}
	
}
