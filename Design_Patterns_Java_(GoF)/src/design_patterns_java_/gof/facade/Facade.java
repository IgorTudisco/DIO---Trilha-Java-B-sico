package design_patterns_java_.gof.facade;

import design_patterns_java_.gof.subsistema1.cm.CrmService;
import design_patterns_java_.gof.subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
