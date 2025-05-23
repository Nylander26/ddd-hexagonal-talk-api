package application.port.in;

import application.service.ReservationRequest;

public interface ManageReservationUseCase {
  void manageReservation(ReservationRequest request);
}
