package domain.model;

import java.time.LocalDate;

public class Reservation {
  private final String reservationId;
  private final LocalDate reservationDate;

  public Reservation(String reservationId, LocalDate reservationDate) {
    if (reservationDate.isBefore(LocalDate.now())) {
      throw new IllegalArgumentException("La fecha de la reserva debe ser posterior a la fecha actual.");
    }
    this.reservationId = reservationId;
    this.reservationDate = reservationDate;
  }

  public String getReservationId() {
    return reservationId;
  }

  public LocalDate getReservationDate() {
    return reservationDate;
  }
}