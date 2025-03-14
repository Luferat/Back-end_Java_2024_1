package aula08.exercicios.exercicio_04;

public class Main {

    public static void main(String[] args) {
        // instancia o objeto
        Manager teste1 = new Manager();

        // Atrtubui os atributos diretamente (FEIO!)
        teste1.name = "Joca da Silva";
        teste1.salary = 2000.99;
        teste1.bonus = 10;

        // Calcula o salário com o bônus
        double finalSalary = teste1.salary + teste1.salary * teste1.bonus / 100;

        // Converte números para string
        String newSalary = "" + teste1.salary;
        String newFinalsalary = "" + finalSalary;

        // Saída em várias linhas
        System.out.println(
                "Nome: " + teste1.name + "\n" +
                "Salário: R$" + newSalary.replace(".", ",") + "\n" +
                "Bônus: " + teste1.bonus + "%\n" +
                "Total: R$" + newFinalsalary.replace(".", ",")
        );

    }
}
