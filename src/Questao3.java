import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        Scanner leia = new Scanner(System.in);
        float num;
        num = leia.nextFloat();
        System.out.println("Informe outro número: ");
        float num2;
        num2 = leia.nextFloat();
        leia.close();
        float soma;

        soma = num + num2;

        System.out.println("A soma dos números informados é: " + soma);
    }

}