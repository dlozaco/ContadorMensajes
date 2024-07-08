package cagadas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chat {
	private List<Mensaje> chat;
	
	public Chat() {
		chat = new ArrayList<>();
	}
	
	public Chat(Stream<Mensaje> chats) {
		chat = chats.toList();
	}

	@Override
	public String toString() {
		return "Chat ["+chat+"]";
	}
	
	public boolean esCaca(String mensaje) {
		return mensaje.startsWith("💩");
	}
	
	public Map<String,Long> contarCacas(){
		return chat.stream()
				.filter(c-> !c.nombre().equals("Moderacion") && esCaca(c.mensaje()))
				.collect(Collectors.groupingBy(Mensaje::nombre,
						Collectors.counting()));
				
	}
}
