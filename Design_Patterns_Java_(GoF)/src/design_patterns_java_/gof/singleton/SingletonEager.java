package design_patterns_java_.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author falvojr
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		System.out.println("---------------------------");
		System.out.println("Instanciado SingletonEager.");
		return instancia;
	}
}
