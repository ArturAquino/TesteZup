package br.mg.com.zup.cenario;

public enum Posicao{
	
	N(0,1){
		
		@Override
		public Posicao posicaoDireita(){
			return E;
		}
		
		@Override
		public Posicao posicaoEsquerda(){
			return W;
		}
		
	},
	
	S(0,-1){
		
		@Override
		public Posicao posicaoDireita(){
			return W;
		}
		
		@Override
		public Posicao posicaoEsquerda(){
			return E;
		}
		
	},
	
	E(1,0){
		
		@Override
		public Posicao posicaoDireita(){
			return S;
		}
		
		@Override
		public Posicao posicaoEsquerda(){
			return N;
		}
		
	},
	
	W(-1,0){
		
		@Override
		public Posicao posicaoDireita(){
			return N;
		}
		
		@Override
		public Posicao posicaoEsquerda(){
			return S;
		}
		
	};
	
	public abstract Posicao posicaoDireita();
	public abstract Posicao posicaoEsquerda();
	
	private final int movX;
	private final int movY;
	
	Posicao(final int movX, final int movY){
		this.movX = movX;
		this.movY = movY;
	}
	
	public int getMovX(){
		return movX;
	}
	
	public int getMovY(){
		return movY;
	}
	
}
	
