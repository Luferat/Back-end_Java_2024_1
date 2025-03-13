package aula05.exercicios.exercicio_10;

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.sum(3, 4));
        System.out.println(math.sum(3, 4, 5));
        System.out.println(math.sum(3.5, 2.5));
    }
}