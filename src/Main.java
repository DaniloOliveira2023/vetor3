import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int soma = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor");
            vetorA[i] = s.nextInt();
            soma += vetorA[i];
        }
            System.out.println("A soma dos valores do vetor é " + soma);
        }
    }