import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
		    concatenarPalabras(scanner);
                    break;
                case 2:
		    contarPalabras(scanner);
                    break;
                case 3:

                    break;
                case 4:
                    if (confirmarSalida(scanner)) {
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    } else {
                        opcion = 0; // Para no salir del bucle
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void concatenarPalabras(Scanner scanner) {
	System.out.print("Ingrese la primera palabra: ");
	String palabra1 = scanner.nextLine();
	System.out.print("Ingrese la segunda palabra: ");
	String palabra2 = scanner.nextLine();

	String resultado = palabra1 + palabra2;
	System.out.println("Resultado: " + resultado);
    }

    private static void contarPalabras(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String[] palabras = frase.trim().split("\\s+");
        System.out.println("Número de palabras en la frase: " + palabras.length);
    }






















    private static boolean confirmarSalida(Scanner scanner) {
        System.out.print("¿Está seguro que desea salir? (S/N): ");
        char respuesta = scanner.next().toUpperCase().charAt(0);
        return respuesta == 'S';
    }
}
