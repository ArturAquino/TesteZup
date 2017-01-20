package br.mg.com.zup.comandos;

import br.mg.com.zup.robo.Robo;

public class ViraDir implements ICmd {
	
	@Override
	public void inicia(Robo robo){
		robo.virarDireita();
	}
	
}