package Introduccion_POO;

public class Auto0 {
    String marca;
    String modelo;
    int año;

    // CONSTRUCTOR
    public Auto0(String marca, String modelo, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Auto0(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto0(String marca) {
        this.marca = marca;
    }

    public Auto0() {
    }

    public void imprimirDatos() {
        if (this.marca == null && this.modelo == null && this.año == 0) {
        System.out.println("El constructor está vacío. No hay datos para mostrar");
        
        } else {
        if (this.marca != null) {
        System.out.println("Marca: " + this.marca);
        } else {
        System.out.println("Marca: No especificada");
        }
        if (this.modelo != null) {
        System.out.println("Modelo: " + this.modelo);
        } else {
        System.out.println("Modelo: No especificado");
        }
        if (this.año != 0) {
        System.out.println("Año: " + this.año);
        } else {
        System.out.println("Año: No especificado");
        }
        System.out.println("------------------------------");
        }
        }
}
