package application.port.out;

import domain.model.Reservation;

public interface ReservationRepository {
  void saveReservation(Reservation reservation);
}
