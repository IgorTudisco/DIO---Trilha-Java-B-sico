package design_patterns_java_.gof.subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "S�o Paulo";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
