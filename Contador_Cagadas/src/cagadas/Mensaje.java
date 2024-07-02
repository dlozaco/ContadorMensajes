package cagadas;

import java.time.LocalDateTime;
import java.util.Objects;

public record Mensaje(LocalDateTime fechaHora, String nombre, String mensaje) {
	
	@Override
	public String toString() {
		return "Mensaje [fechaHora=" + fechaHora + ", nombre=" + nombre + ", mensaje=" + mensaje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mensaje, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(mensaje, other.mensaje) && Objects.equals(nombre, other.nombre);
	}
	
	public boolean esModeracion(){
		return nombre == "Moderacion";
	}
	
}
