package Introduccion_POO;

public class Auto {
    String marca;
    String modelo;
    int año;
    String color;

    // constructor 
    public Auto(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    // constructor sin parámetros
    public Auto() {
        this("Desconocida", "Desconocido", 2024, "Desconocido");
    }

    public void imprimirAtributos() {
        System.out.println("\nAtributos del Auto:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }
}

