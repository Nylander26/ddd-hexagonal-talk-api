package domain.model;

public class Flight {
  private final String flightNumber;

  public Flight(String flightNumber) {
    if (!isValidFlightNumber(flightNumber)) {
      throw new IllegalArgumentException("Número de vuelo inválido. Debe comenzar con 'IB' seguido de 3 dígitos.");
    }
    this.flightNumber = flightNumber;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  private boolean isValidFlightNumber(String flightNumber) {
    return flightNumber.matches("IB\\d{3}");
  }
}
