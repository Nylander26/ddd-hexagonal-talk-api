package domain.model;

public class Route {
  private final String origin;
  private final String destination;

  public Route(String origin, String destination) {
    if (!isValidCode(origin) || !isValidCode(destination)) {
      throw new IllegalArgumentException("Los códigos de origen y destino deben ser exactamente 3 letras mayúsculas.");
    }
    this.origin = origin;
    this.destination = destination;
  }

  public String getOrigin() {
    return origin;
  }

  public String getDestination() {
    return destination;
  }

  private boolean isValidCode(String code) {
    return code.matches("[A-Z]{3}");
  }
}