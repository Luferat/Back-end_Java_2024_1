package aula08.exemplo_interface;

// Classe Cat implementando a interface Animal
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("O gato mia: Miau!");
    }

    @Override
    public void move() {
        System.out.println("O gato pula.");
    }
}
