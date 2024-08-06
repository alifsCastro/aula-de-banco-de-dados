import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;

        if (soma <= 2) {
            System.out.println(" A soma dos número é igual ou menor que 2");
        }else if (soma != 12){
            System.out.println("o numero é diferente de 12");
        }else{
            System.out.println("Tudo errado");
        }
          //   int numero1 = 1;
          //   int numero2 = 1;
        // System.out.println("A soma dos numero é " + (numero1 + numero2));

       // String nome ="Alif";
       // String curso = "TADS";
       // System.out.println(nome + " do curso " + curso);

       // int nnumero1 = 5;
       // int nnumero2 = 3;
       // double resultado = ((double) nnumero1 / nnumero2);
       // System.out.println("A soma dos numeros é igual a " + resultado);
    }
}
