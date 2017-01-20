package br.mg.com.zup.cenario;

public class Plato{
	
	private Coordenada superDir = new Coordenada(0, 0);
	private Coordenada inferEsq = new Coordenada(0, 0);
	
	public Plato(final int superDirX, final int superDirY){
		
		this.superDir.setX(superDir.getX() + superDirX);
		this.superDir.setY(superDir.getY() + superDirY);
		
	}
	
	public boolean foraLimitePlato(final Coordenada c){
		if ((c.getX() <= this.superDir.getX() &&
				c.getY() <= this.superDir.getY()) &&
				(c.getX() >= this.inferEsq.getX() &&
				c.getY() >= this.inferEsq.getY()))
			return false;
		else
			return true;
	}
	
}