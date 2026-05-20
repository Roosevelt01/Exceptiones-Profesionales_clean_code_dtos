package Arquitectura_capas_dto.Excepciones_profesionales.Ejercicio_1_Retiro_bancario_excepciones_profesionales;

public class Account {
    private String accountId;
    private String userId;
    private double balance;
    private boolean blocked;

    public Account(String accountId, String userId, double balance, boolean blocked) {
        this.accountId = accountId;
        this.userId = userId;
        this.balance = balance;
        this.blocked = blocked;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return blocked;
    }
}
