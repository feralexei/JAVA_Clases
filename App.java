package Introduccion_POO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //ObjetoPersona();
        //UsandoConstructores();
        //FiguraGeometrica();
        EjercicioComplementario();
    }

    public static void ObjetoPersona() {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 25;

        Persona persona2 = new Persona();
        persona2.nombre = "Maria";
        persona2.edad = 30;

        persona1.imprimirDatos();
        persona2.imprimirDatos();
    }

    public static void UsandoConstructores() {
        Auto0 auto1 = new Auto0("Chevrolet", "Aveo", 2022);
        Auto0 auto2 = new Auto0("KIA", "Picanto");
        Auto0 auto3 = new Auto0("Nissan");
        Auto0 auto4 = new Auto0();

        // Mostrar los atributos de los autos creados
        System.out.println("AUTO 1:");
        auto1.imprimirDatos();
        System.out.println("AUTO 2:");
        auto2.imprimirDatos();
        System.out.println("AUTO 3:");
        auto3.imprimirDatos();
        System.out.println("AUTO 4:");
        auto4.imprimirDatos();

    }

    public static void FiguraGeometrica() {

        Scanner scanner = new Scanner(System.in);
        Rectangulo[] rectangulos = new Rectangulo[10];
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear rectángulo");
            System.out.println("2. Calcular área y perímetro de un rectángulo");
            System.out.println("3. Ver número total de rectángulos creados");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo nuevoRectangulo = new Rectangulo(ancho, alto);

                    rectangulos[Rectangulo.getContadorRectangulos() - 1] =

                            nuevoRectangulo;

                    System.out.println("Rectángulo creado.");

                    break;
                case 2:
                    System.out.print("Ingrese el índice del rectángulo: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < Rectangulo.getContadorRectangulos()) {
                        System.out.println("Área del rectángulo: " + rectangulos[indice].area());

                        System.out.println("Perímetro del rectángulo: " + rectangulos[indice].perimetro());

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Número total de rectángulos: " +

                            Rectangulo.getContadorRectangulos());

                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una opción válida.");
            }
        } while (opcion != 4);
        scanner.close();
    }

    public static void EjercicioComplementario() {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    auto = crearAutoCompleto(scanner);
                    break;
                case 2:
                    auto = new Auto();
                    System.out.println("Auto creado con valores por defecto.");
                    break;
                case 3:
                    if (auto != null) {
                        auto.imprimirAtributos();
                    } else {
                        System.out.println("No se ha creado ningún auto todavía.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    // menú de opciones
    public static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Crear auto completo");
        System.out.println("2. Crear auto con valores por defecto");
        System.out.println("3. Mostrar detalles del auto");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // metodo para crear auto
    public static Auto crearAutoCompleto(Scanner scanner) {
        System.out.print("Ingrese la marca del auto: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del auto: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año del auto: ");
        String añoInput = scanner.nextLine();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el color del auto: ");
        String color = scanner.nextLine();

        int año = añoInput.isEmpty() ? 2024 : Integer.parseInt(añoInput);

        return new Auto(marca.isEmpty() ? "Desconocido" : marca,
                        modelo.isEmpty() ? "Desconocido" : modelo,
                        año,
                        color.isEmpty() ? "Desconocido" : color);
    }
}