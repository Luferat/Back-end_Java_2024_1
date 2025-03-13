package aula08.exemplo_interface;

// Classe Dog implementando a interface Animal
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("O cachorro late: Au Au!");
    }

    @Override
    public void move() {
        System.out.println("O cachorro corre.");
    }
}
