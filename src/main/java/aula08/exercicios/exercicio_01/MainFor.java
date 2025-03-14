package aula08.exercicios.exercicio_01;

public class MainFor {

    public static void main(String[] args) {

        Book[] collection = {
                new Book("Código Limpo", "J. C. Martin", 2017),
                new Book("Harry Potter: o porteiro do prédio", "A dona lá da Inglaterra", 2018),
                new Book("Receitas Fantásticas da Tia", "Tia Jonelclice", 2023)
        };

        for (int i = 0; i < collection.length; i++) {
            System.out.println(collection[i].getTitle());
            System.out.println("\tPor " + collection[i].getAuthor());
            System.out.println("\tEm " + collection[i].getYear());
            System.out.println(" ");
        }
    }
}