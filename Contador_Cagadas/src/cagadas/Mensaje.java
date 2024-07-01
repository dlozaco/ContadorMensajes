package cagadas;

import java.time.LocalDateTime;

public record Mensaje(LocalDateTime fechaHora, String nombre, String mensaje) {
	
}
