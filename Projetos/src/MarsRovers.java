import br.mg.com.zup.cenario.Coordenada;
import br.mg.com.zup.cenario.Plato;
import br.mg.com.zup.cenario.Posicao;
import br.mg.com.zup.robo.Robo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class MarsRovers{
	
	public static void main(String[] args){

		String[] tamPlato = null;
		String[] posRobo = null;
		String comando = null;

		System.out.println("Informe a quantidade de Robos: ");

		String qtdRobos = entradaDados();
		int robos = 0;

		if(isNumber(qtdRobos)){
			robos = Integer.parseInt(qtdRobos);
		}else {
			System.out.println("Informe SOMENTE numeros!");
			return;
		}

		System.out.println("Informe o tamanho do Plato: ");
		tamPlato = entradaDados().split(" ");

		Plato plato = new Plato(Integer.parseInt(tamPlato[0]), Integer.parseInt(tamPlato[1]));
		
		for(int i = 0; i < robos; i++){

			System.out.println("Informe a posicao inicial do robo "+(i+1)+": ");
			posRobo = entradaDados().toUpperCase().split(" ");

			System.out.println("Passe o(s) comando(s): ");
			comando = entradaDados();
			
			Coordenada coord = new Coordenada(Integer.parseInt(posRobo[0]), Integer.parseInt(posRobo[1]));
			Robo expRobo = new Robo(coord, Posicao.valueOf(posRobo[2]), plato);
			
			expRobo.executarCmd(comando);
			
			System.out.println("Posicao do Robo "+(i+1)+": "+expRobo.localizacao());
			
			
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
