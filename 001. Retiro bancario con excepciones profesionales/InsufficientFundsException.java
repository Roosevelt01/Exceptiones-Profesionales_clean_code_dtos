package Arquitectura_capas_dto.Excepciones_profesionales.Ejercicio_1_Retiro_bancario_excepciones_profesionales;

public class InsufficientFundsException extends RuntimeException {
  public InsufficientFundsException(String message) {
    super(message);
  }
}
