package domain.model;

public class Seat {
  private final int row;
  private final char column;

  public Seat(int row, char column) {
    if (row < 1 || row > 10 || column < 'A' || column > 'D') {
      throw new IllegalArgumentException("Asiento inválido. Las filas deben estar entre 1-10 y las columnas entre A-D.");
    }
    this.row = row;
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public char getColumn() {
    return column;
  }

  @Override
  public String toString() {
    return row + String.valueOf(column);
  }
}
