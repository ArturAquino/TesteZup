package br.mg.com.zup.comandos;

import java.util.*;

public class ConjComandos{

	private String cmd;
	
	private static Map<String, ICmd> strToCmd = new HashMap<String, ICmd>(){{
	
		put("L", new ViraEsq());
		put("M", new Andar());
		put("R", new ViraDir());
		
	}};
	
	public ConjComandos(final String cmd){
		this.cmd = cmd;
	}
	
	public List<ICmd> comandos(){
		
		if("".equals(cmd.replaceAll(" ", "")) || cmd == null){	
			
			return new ArrayList<ICmd>();
		}
		else{
			
			List<ICmd> listaCmd = new ArrayList<ICmd>();
			
			for(String comando:(Arrays.copyOfRange(cmd.split(""), 0, cmd.length() + 1))){
				if(comando != null){
					ICmd comandoMap = strToCmd.get(comando.toUpperCase());
					listaCmd.add(comandoMap);
				}
				else{
					break;
				}
			}
			
			return listaCmd;
		}
	}

	
}