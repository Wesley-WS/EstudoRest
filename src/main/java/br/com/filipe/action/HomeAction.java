package br.com.filipe.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.filipe.facade.ListarFacade;
import br.com.filipe.facade.ListarFacadeImpl;

public class HomeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ListarFacade listarFacade = new ListarFacadeImpl();
	
	public String listar() throws Exception {
		listarFacade.listar();
		
		return SUCCESS;
	}
}
