package aula05.exercicios.exercicio_03;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        account.withdraw(100);

        System.out.println("Saldo: R$" + account.getBalance());
    }
}