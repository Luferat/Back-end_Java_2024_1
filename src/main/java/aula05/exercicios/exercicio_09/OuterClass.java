package aula05.exercicios.exercicio_09;

public class OuterClass {
    private String message = "Olá do OuterClass!";

    class InnerClass {
        void showMessage() {
            System.out.println(message);
        }
    }
}
