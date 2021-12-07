package br.com.filipe.action;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import br.com.filipe.facade.ListarFacade;
import br.com.filipe.facade.ListarFacadeImpl;

@Controller
@Scope("request")
public class HomeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ListarFacade listarFacade = new ListarFacadeImpl();
	
	public String listar() throws Exception {
		listarFacade.listar();
		
		return SUCCESS;
	}
}
