package aula05.exercicios.exercicio_07;

public class Main {
    public static void main(String[] args) {
        Playable instrument1 = new Guitar();
        Playable instrument2 = new Piano();

        instrument1.play();
        instrument2.play();
    }
}