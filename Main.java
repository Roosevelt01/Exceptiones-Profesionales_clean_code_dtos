package Arquitectura_capas_dto.Excepciones_profesionales.Ejercicio_1_Retiro_bancario_excepciones_profesionales;

import java.util.List;

public class Main {
    public static String approveWithdrawal(
            List<User> users,
            List<Account> accounts,
            String userId,
            String accountId,
            double amount
    ) {

        User user = users.stream()
                .filter(u -> u.getUserId().equals(userId))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));

        Account account = accounts.stream()
                .filter(acc -> acc.getAccountId().equals(accountId))
                .findFirst()
                .orElseThrow(() -> new AccountNotFoundException("Cuenta no encontrada"));

        if(!account.getUserId().equals(user.getUserId())){
            throw new InvalidAccountOwnerException("La cuenta no pertenece al usuario");
        }

        if(account.isBlocked()){
            throw new AccountBlockedException("La cuenta está bloequeda");
        }

        if(account.getBalance() < amount){
            throw new InsufficientFundsException("Saldo insuficiente");
        }
        return "Retiro aprobado";
    }

    public static void main(String[] args) {
        List<User> users = List.of(
            new User("U-1", "Alex"),
            new User("U-2", "Maria")
        );

        List<Account> accounts = List.of(
            new Account("ACC-1", "U-1", 5000.0, false),
            new Account("ACC-2", "U-1", 200.0, false),
            new Account("ACC-3", "U-2", 8000.0, true)
        );

        System.out.println(
                approveWithdrawal(users, accounts, "U-1", "ACC-1", 1000.0)
        );
    }
}
