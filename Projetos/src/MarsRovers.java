import br.mg.com.zup.cenario.Coordenada;
import br.mg.com.zup.cenario.Plato;
import br.mg.com.zup.cenario.Posicao;
import br.mg.com.zup.robo.Robo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsRovers{
	
	public static void main(String[] args){

		int qtdRobos = 0;

		String[] tamPlato = null;
		String[] posRobo = null;
		String comando = null;

		tamPlato = entradaDados().split(" ");

		Plato plato = new Plato(Integer.parseInt(tamPlato[0]), Integer.parseInt(tamPlato[1]));
		
		for(int i = 0; i < 2; i++){
			posRobo = entradaDados().toUpperCase().split(" ");
			comando = entradaDados();
			
			Coordenada coord = new Coordenada(Integer.parseInt(posRobo[0]), Integer.parseInt(posRobo[1]));
			Robo expRobo = new Robo(coord, Posicao.valueOf(posRobo[2]), plato);
			
			expRobo.executarCmd(comando);
			
			System.out.println("Posicao do Robo "+i+": "+expRobo.localizacao());
			
			
		}
		
		
	}

	/**
	 * @return
	 */
	private static String entradaDados(){
		try{
		
			if(System.console() != null){
				return System.console().readLine();
			}
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			return entrada.readLine();
			
		}catch(IOException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	
}