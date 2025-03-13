package aula05.exercicios.exercicio_01;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("O Hobbit", "J.R.R. Tolkien", 1937);
        Book book3 = new Book("Dom Casmurro", "Machado de Assis", 1899);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}