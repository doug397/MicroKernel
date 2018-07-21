package br.com.padores.app;
import br.com.padores.interfaces.ICore;
import br.com.padores.interfaces.IPlugin;
import br.com.padores.nucleo.Core;

public class App {

	public static void main(String[] args) {
		
		ICore core = new Core();
	    core.init();

	}

}
