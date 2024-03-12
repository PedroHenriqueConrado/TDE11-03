import java.util.Scanner;

public class TDE01x03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número inteiro e positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erro: Você deve digitar um número inteiro.");
                System.out.print("Digite um número inteiro e positivo: ");
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Erro: Você deve digitar um número positivo.");
            }
        } while (numero <= 0);

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
