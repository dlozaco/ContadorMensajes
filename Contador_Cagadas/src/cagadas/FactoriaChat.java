package cagadas;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class FactoriaChat {
	
	public static Chat crearChat(String ruta) {
	       try (Stream<Mensaje> mensajes = Files.lines(Paths.get(ruta))
	               .map(FactoriaChat::parseaMensaje)) {
	           return new Chat(mensajes);
	       }
	       catch (Exception e) {
	           e.printStackTrace();
	           return null;
	           }
	 }
	
	private static Mensaje parseaMensaje(String linea) {
		String[] trozos = linea.split("-");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yy, H:mm");
		LocalDateTime fechaHora = LocalDateTime.parse(trozos[0].trim(),formato);
		String msg = trozos[1].trim();
		String nombre = "Moderacion";
		String mensaje = "Moderacion";
		if(!esModeracionFactoria(msg)) {
			String[] trozos2 = msg.split(":");
			nombre = trozos2[0].trim();
			mensaje = trozos2[1].trim();
		}
		return new Mensaje(fechaHora, nombre, mensaje);
	}

	private static Boolean esModeracionFactoria(String texto) {
		Boolean res = true;
		for(int i = 0;  i <= texto.length()-1;i++) {
			if(texto.charAt(i) == ':') {
				res = false;
				break;
			}
		}
		return res;
	}

}
