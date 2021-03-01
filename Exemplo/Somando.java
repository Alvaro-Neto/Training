
import java.util.Scanner;

public class Somando {
    public static void main(String args[]) {

        int soma = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);

        while (soma < 300) {

            System.out.print("Digite um número: ");
            num = input.nextInt();

            if (num < 0) {
                System.out.println("Números negativos não são permitidos ");

            } else {
                soma = soma + num;

            }
        }
        System.out.print("O somatório foi: " + soma);
    }
}