package application.service;

import java.time.LocalDate;

public class ReservationRequest {
  private final String id;
  private final LocalDate date;

  public ReservationRequest(String id, LocalDate date) {
    this.id = id;
    this.date = date;
  }

  public String getId() {
    return id;
  }

  public LocalDate getDate() {
    return date;
  }
}