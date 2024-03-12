import java.util.Scanner;

public class TDE01x01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        double aumento = salario * 0.10;
        double novoSalario = salario + aumento;

        System.out.println("Olá, " + nome + "! Seu salário atual é de R$" + salario + ". Com o aumento de 10%, seu novo salário será de R$" + novoSalario + ".");

        scanner.close();
    }
}


