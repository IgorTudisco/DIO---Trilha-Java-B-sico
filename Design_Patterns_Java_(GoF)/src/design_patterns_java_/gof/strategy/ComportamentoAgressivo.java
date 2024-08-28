package design_patterns_java_.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("---------------------------");
		System.out.println("Iniciando movimento agrecivo.");
		System.out.println("Movendo-se agressivamente...");
	}

}
