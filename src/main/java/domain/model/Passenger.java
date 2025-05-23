package domain.model;

import java.util.regex.Pattern;

public class Passenger {
  private final String dni; // Documento Nacional de Identidad

  public Passenger(String dni) {
    if (!isValidDni(dni)) {
      throw new IllegalArgumentException("DNI inválido. Debe tener 8 dígitos seguidos de una letra mayúscula.");
    }
    this.dni = dni;
  }

  public String getDni() {
    return dni;
  }

  private boolean isValidDni(String dni) {
    return Pattern.matches("\\d{8}[A-Z]", dni);
  }
}