package design_patterns_java_.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author falvojr
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			System.out.println("---------------------------");
			System.out.println("Instanciando... SingletonLazy.");
			instancia = new SingletonLazy();
		}
		System.out.print("=> ");
		System.out.println("Instanciado SingletonLazy.");
		return instancia;
	}
}
