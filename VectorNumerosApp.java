import java.util.Scanner;

public class VectorNumerosApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[15];

        // === LLENADO (ya existía) ===
        System.out.println("=== LLENADO DEL VECTOR (10-100) ===");
        for (int i = 0; i < vector.length; i++) {
            int numero;
            do {
                System.out.print("Posición [" + i + "]: ");
                numero = teclado.nextInt();
                if (numero < 10 || numero > 100) {
                    System.out.println(" Fuera de rango. Intente de nuevo.");
                }
            } while (numero < 10 || numero > 100);
            vector[i] = numero;
        }

        System.out.println("\n VECTOR LLENADO:");
        for (int v : vector) System.out.print(v + " ");
        System.out.println();

        // === NUEVO: BUSCAR VALOR ===
        System.out.print("\n🔍 Ingresa un número para buscar: ");
        int buscar = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println(" Encontrado en la posición [" + i + "]");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println(" El número NO está en el vector.");

        // === NUEVO: MAYOR Y MENOR ===
        int mayor = vector[0], menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) mayor = vector[i];
            if (vector[i] < menor) menor = vector[i];
        }
        System.out.println("\n Mayor: " + mayor + " |  Menor: " + menor);

        // === NUEVO: MÚLTIPLOS DE X ===
        System.out.print("\n Ingresa un número X para buscar múltiplos: ");
        int x = teclado.nextInt();
        boolean hay = false;
        System.out.print("Múltiplos de " + x + ": ");
        for (int v : vector) {
            if (v % x == 0) {
                System.out.print(v + " ");
                hay = true;
            }
        }
        System.out.println(hay ? "" : "No hay múltiplos de " + x + " en el vector.");

        // === NUEVO: SUMA ===
        int suma = 0;
        for (int v : vector) suma += v;
        System.out.println("\n Suma total: " + suma);

        teclado.close();
    }
}
