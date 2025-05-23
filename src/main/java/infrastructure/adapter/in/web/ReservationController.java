package infrastructure.adapter.in.web;

import application.port.in.ManageReservationUseCase;
import application.service.ReservationRequest;
import infrastructure.adapter.in.web.dto.ReservationRequestDto;
import infrastructure.adapter.in.web.dto.ReservationResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

  private final ManageReservationUseCase manageReservationUseCase;

  public ReservationController(ManageReservationUseCase manageReservationUseCase) {
    this.manageReservationUseCase = manageReservationUseCase;
  }

  @PostMapping
  public ResponseEntity<ReservationResponseDto> createReservation(@RequestBody ReservationRequestDto requestDto) {
    // Lógica para mapear el DTO a un objeto de dominio y llamar al caso de uso
    manageReservationUseCase.manageReservation(new ReservationRequest(
        requestDto.getPassengerDni(),
//        requestDto.getFlightNumber(),
//        requestDto.getRouteOrigin(),
//        requestDto.getRouteDestination(),
        requestDto.getReservationDate()
    ));

    // Respuesta de éxito
    ReservationResponseDto responseDto = new ReservationResponseDto("Reserva creada con éxito", "1A");
    return ResponseEntity.ok(responseDto);
  }
}