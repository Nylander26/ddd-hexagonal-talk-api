package infrastructure.adapter.in.web.dto;

public class ReservationResponseDto {
  private String message;
  private String seat;

  public ReservationResponseDto(String message, String seat) {
    this.message = message;
    this.seat = seat;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }
}
