package aula08.exercicios.exercicio_01;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.trim();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = LocalDate.now().getYear();  // Obtém o ano atual
        if (year > currentYear) {
            System.out.println("Oooops! " + year + " está no futuro.");
        } else {
            this.year = year;
        }
    }
}
