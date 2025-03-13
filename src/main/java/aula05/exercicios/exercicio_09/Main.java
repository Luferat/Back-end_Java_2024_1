package aula05.exercicios.exercicio_09;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.showMessage();
    }
}
