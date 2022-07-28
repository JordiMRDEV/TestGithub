import java.util.Scanner;

public class palindrom {
    public palindrom() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introdueix la paraula:");
        String paraula = teclado.nextLine();
        StringBuilder stringBuilder = new StringBuilder(paraula);
        String invertida = stringBuilder.reverse().toString();
        if (invertida == paraula) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("NO es un palindromo");
        }

    }
}
