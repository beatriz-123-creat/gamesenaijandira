import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int resultado = leitor.nextInt();
        //calculo para chegar ao resultado
        if (resultado % 2 == 0) {
            System.out.println("O numero " + resultado + " PAR!");
        }else{
            System.out.println("O numero " + resultado + " ÍMPAR!");
        }
    }
}
