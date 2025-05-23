package application.service;


import application.port.in.ManageReservationUseCase;
import application.port.out.ReservationRepository;
import domain.model.Reservation;

public class ManageReservationService implements ManageReservationUseCase {
  private final ReservationRepository reservationRepository;

  public ManageReservationService(ReservationRepository reservationRepository) {
    this.reservationRepository = reservationRepository;
  }

  @Override
  public void manageReservation(ReservationRequest request) {
    // Lógica para decidir qué caso de uso invocar
    Reservation reservation = new Reservation(request.getId(), request.getDate());
    reservationRepository.saveReservation(reservation);
  }
}