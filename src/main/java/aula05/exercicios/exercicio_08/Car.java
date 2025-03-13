package aula05.exercicios.exercicio_08;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(brand + " - " + year);
    }
}


