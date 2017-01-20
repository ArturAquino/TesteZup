package br.mg.com.zup.cenario;

public class Coordenada{
	
	private int x;
	private int y;
	
	public Coordenada(int coordX, int coordY){
		this.setX(coordX);
		this.setY(coordY);
	}

	public Coordenada atualizaCoord(final int coordX, final int coordY){

		return new Coordenada(this.x + coordX, this.y + coordY);
	}
	
	/*Manipulação das Coordenadas X*/
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	/*Manipulação das Coordenadas Y*/
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
}