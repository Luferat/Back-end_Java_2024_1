package aula05.exercicios.exercicio_04;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name + " - R$" + salary);
    }
}

