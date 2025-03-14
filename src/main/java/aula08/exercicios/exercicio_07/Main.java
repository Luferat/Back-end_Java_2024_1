package aula08.exercicios.exercicio_07;

public class Main {
    public static void main(String[] args) {

        Guitar guitarra = new Guitar();
        Piano piano = new Piano();

        // O print já está no método!
        System.out.print("A guitarra faz ");
        guitarra.play();
        System.out.print("O piano faz ");
        piano.play();

    }
}
