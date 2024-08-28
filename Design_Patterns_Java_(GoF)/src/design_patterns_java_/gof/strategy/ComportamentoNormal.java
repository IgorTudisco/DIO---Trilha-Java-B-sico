package design_patterns_java_.gof.strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("---------------------------");
		System.out.println("Iniciando movimento normal.");
		System.out.println("Movendo-se normalmente...");
	}

}
