package design_patterns_java_.gof;

import design_patterns_java_.gof.facade.Facade;
import design_patterns_java_.gof.singleton.SingletonEager;
import design_patterns_java_.gof.singleton.SingletonLazy;
import design_patterns_java_.gof.singleton.SingletonLazyHolder;
import design_patterns_java_.gof.strategy.Comportamento;
import design_patterns_java_.gof.strategy.ComportamentoAgressivo;
import design_patterns_java_.gof.strategy.ComportamentoDefensivo;
import design_patterns_java_.gof.strategy.ComportamentoNormal;
import design_patterns_java_.gof.strategy.Robo;

public class Design_Patterns_Java_GoF {
public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Igor", "01153000");
	}    
}
