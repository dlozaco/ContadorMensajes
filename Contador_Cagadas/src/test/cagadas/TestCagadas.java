package test.cagadas;

import cagadas.Chat;
import cagadas.FactoriaChat;

public class TestCagadas {

	public static void main(String[] args) {
		String ruta = "data/Chat de WhatsApp con 💩";
		Chat c = FactoriaChat.crearChat(ruta);
		System.out.println(c);
	}

}
