package design_patterns_java_.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("---------------------------");
		System.out.println("Iniciando movimento de defensa.");
		System.out.println("Movendo-se defensivamente...");
	}

}
