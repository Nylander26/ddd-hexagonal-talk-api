package infrastructure.adapter.in.web.dto;

import java.time.LocalDate;

public class ReservationRequestDto {
  private String passengerDni;
  private String flightNumber;
  private String routeOrigin;
  private String routeDestination;
  private LocalDate reservationDate;

  public ReservationRequestDto(String passengerDni, String flightNumber, String routeOrigin,
      String routeDestination, LocalDate reservationDate) {
    this.passengerDni = passengerDni;
    this.flightNumber = flightNumber;
    this.routeOrigin = routeOrigin;
    this.routeDestination = routeDestination;
    this.reservationDate = reservationDate;
  }

  public String getPassengerDni() {
    return passengerDni;
  }

  public void setPassengerDni(String passengerDni) {
    this.passengerDni = passengerDni;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getRouteOrigin() {
    return routeOrigin;
  }

  public void setRouteOrigin(String routeOrigin) {
    this.routeOrigin = routeOrigin;
  }

  public String getRouteDestination() {
    return routeDestination;
  }

  public void setRouteDestination(String routeDestination) {
    this.routeDestination = routeDestination;
  }

  public LocalDate getReservationDate() {
    return reservationDate;
  }

  public void setReservationDate(LocalDate reservationDate) {
    this.reservationDate = reservationDate;
  }
}
