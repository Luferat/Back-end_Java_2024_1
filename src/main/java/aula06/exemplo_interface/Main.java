package aula06.exemplo_interface;

// Classe de teste
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Criando um Dog via referência da interface
        Animal cat = new Cat(); // Criando um Cat via referência da interface

        System.out.println("Testando o cachorro:");
        dog.makeSound();
        dog.move();

        System.out.println("\nTestando o gato:");
        cat.makeSound();
        cat.move();
    }
}

