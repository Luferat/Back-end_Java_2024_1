package aula05.exercicios.exercicio_02;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lucas");
        student.setAge(20);

        System.out.println("Nome: " + student.getName());
        System.out.println("Idade: " + student.getAge());
    }
}