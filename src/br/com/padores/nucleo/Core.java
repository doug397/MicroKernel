package br.com.padores.nucleo;

import br.com.padores.interfaces.ICore;
import br.com.padores.interfaces.IDBControler;
import br.com.padores.interfaces.IPlugin;
import br.com.padores.interfaces.IUIControler;

public class Core implements ICore {
	
	private IUIControler controler;
	private IPlugin pluginControler;
	private IDBControler dbControler;
	
	public Core() {
		controler = new IUControler();
		pluginControler = new PluginControler();
		dbControler = new DBControler();
	}
	
	public IUIControler getControler() {
		return controler;
	}
	public IPlugin getPluginControler() {
		return pluginControler;
	}
	public IDBControler getDbControler() {
		return dbControler;
	}

	@Override
	public void init() {
		System.out.println("Inciando Core e seus Componentes");
		controler.loadControlers();
		pluginControler.loadPlugins();
		dbControler.loadDB();
		
	}

	
	


}
