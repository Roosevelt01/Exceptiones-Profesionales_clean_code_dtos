package Arquitectura_capas_dto.Excepciones_profesionales.Ejercicio_1_Retiro_bancario_excepciones_profesionales;

public class User {
    private String userId;
    private String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
