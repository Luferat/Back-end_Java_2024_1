package aula08.exercicios.exercicio_01;

public class Main {
    public static void main(String[] args) {

        Book codigoLimpo = new Book(
                "Código Limpo",
                "J. C. Martin",
                2017
        );

        Book harryPotter = new Book(
                "Harry Potter: o porteiro do prédio",
                "A dona lá da Inglaterra",
                2018
        );

        Book receitas = new Book(
                "Receitas Fantásticas da Tia",
                "Tia Jonelclice",
                2033 // Testando ano no futuro
        );

        System.out.println(codigoLimpo.getTitle());
        System.out.println("\tPor " + codigoLimpo.getAuthor());
        System.out.println("\tEm " + codigoLimpo.getYear());
        System.out.println(" ");
        System.out.println(harryPotter.getTitle());
        System.out.println("\tPor " + harryPotter.getAuthor());
        System.out.println("\tEm " + harryPotter.getYear());
        System.out.println(" ");
        System.out.println(receitas.getTitle());
        System.out.println("\tPor " + receitas.getAuthor());
        System.out.println("\tEm " + receitas.getYear());

    }
}
