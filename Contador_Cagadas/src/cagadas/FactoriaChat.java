package cagadas;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class FactoriaChat {
	
	public static Chat crearChat(String ruta) {
		Stream<Mensaje> mensajes = null;
		
		try {
			
			mensajes = Files.lines(Paths.get(ruta))
					.skip(1)
					.map(FactoriaChat::parseaMensaje);
			
		} catch(Exception e) {
			System.out.println("Error al procesar el archivo: "+e);
		}
		
		return new Chat(mensajes);

	}
	
	private static Mensaje parseaMensaje(String linea) {
		String[] trozos = linea.split("-");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("D/m/Y, HH:MM");
		LocalDateTime fechaHora = LocalDateTime.parse(trozos[0].trim(),formato);
		
		
		return null;
	}

}
