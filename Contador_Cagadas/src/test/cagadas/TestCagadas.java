package test.cagadas;

import java.util.Map.Entry;

import cagadas.Chat;
import cagadas.FactoriaChat;

public class TestCagadas {

	public static void main(String[] args) {
		String ruta = "inserta ruta";
		Chat c = FactoriaChat.crearChat(ruta);
		System.out.println(c);
		testContarCacas(c);
	}
	
	
	private static void testContarCacas(Chat c) {
		try {
			System.out.println("\n---Test Contar Cacas---");
			for(Entry<String, Long> par:c.contarCacas().entrySet()) {
				System.out.println(par.getKey()+" --> "+par.getValue());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
