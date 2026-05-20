package Arquitectura_capas_dto.Excepciones_profesionales.Ejercicio_1_Retiro_bancario_excepciones_profesionales;

public class InvalidAccountOwnerException extends RuntimeException {
    public InvalidAccountOwnerException(String message) {
        super(message);
    }
}
