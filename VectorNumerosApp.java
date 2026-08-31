import java.util.Scanner;

public class VectorNumerosApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[15];

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
        for (int v : vector) {
            System.out.print(v + " ");
        }
        System.out.println();
        
        teclado.close();
    }
}
