package br.mg.com.zup.robo;

import java.util.List;

import br.mg.com.zup.comandos.ICmd;
import br.mg.com.zup.comandos.ConjComandos;
import br.mg.com.zup.cenario.Coordenada;
import br.mg.com.zup.cenario.Plato;
import br.mg.com.zup.cenario.Posicao;

public class Robo{
	
	private Coordenada c;
	private Posicao p;
	private Plato localExp;
	
	public Robo(final Coordenada c, final Posicao p, final Plato localExp){
		this.c = c;
		this.p = p;
		this.localExp = localExp;
	}
	
	public void executarCmd(final String comando){
		List<ICmd> roboCmd = new ConjComandos(comando).comandos();
        for (ICmd cmd : roboCmd) {
            cmd.inicia(this);
        }
	}
	
	public String localizacao(){
		return (String.valueOf(c.getX())+" "+ String.valueOf(c.getY())+" "+p.toString());
	}
	
	public void virarDireita(){
		this.p = this.p.posicaoDireita();
	}
	
	public void virarEsquerda(){
		this.p = this.p.posicaoEsquerda();
	}
	
	public void movimentar(){
		
		Coordenada novaPosicao = c.atualizaCoord(p.getMovX(), p.getMovY());
		
		if(!(localExp.foraLimitePlato(novaPosicao))){
			c = novaPosicao;
		}
	}
}
