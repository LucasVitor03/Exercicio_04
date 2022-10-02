import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) throws Exception {

        float a1 = 0.0f;
        float a2 = 0.0f;
        float a3 = 0.0f;
        float soma = 0.0f;
        double media = 0.0;
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota A1: ");
        a1 = sc.nextFloat();

        System.out.print("Digite a nota A2: ");
        a2 = sc.nextFloat();

        System.out.print("Digite a nota A3: ");
        a3 = sc.nextFloat();

        soma = a1 + a2 + a3;
        media = soma/3;

        System.out.printf("A soma das notas é: " + soma + "\nA média entre elas é: %.2f", media);

        sc.close();


    }
}