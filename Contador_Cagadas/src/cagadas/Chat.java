package cagadas;

import java.util.*;
import java.util.stream.Stream;

public class Chat {
	private List<Mensaje> chat;
	
	public Chat() {
		chat = new ArrayList<>();
	}
	
	public Chat(Stream<Mensaje> chats) {
		chat = chats.toList();
	}
}
