package Exercicio_22;

import java.util.Scanner;

public class Quest_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd1;
        int qtd2;
        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        int[] vetorC = new int[50];

        do {
            System.out.println("Entre com a quantidade do vetor A ");
            qtd1 = ler.nextInt();

        } while (qtd1 <= 0 | qtd1 > 50);

        for (int i = 0; i < qtd1; i++) {
            System.out.println("Entre com os elementos do vetor A");
            vetorA[i] = ler.nextInt();
        }

        do {
            System.out.println("Entre com a quantidade do vetor B ");
            qtd2 = ler.nextInt();

        } while (qtd2 <= 0 | qtd2 > 50);

        for (int i = 0; i < qtd2; i++) {
            System.out.println("Entre com os elementos do vetor B ");
            vetorB[i] = ler.nextInt();
        }
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;

        for (int i = 0; i < qtd1; i++) {

            for (int j = 0; j < qtd2; j++) {

                if (vetorA[i] == vetorB[j]) {
                    vetorA[i] = 0;
                    vetorB[j] = 0;
                }

            }

        }
        for (int i = 0; i < qtd1; i++) {
            vetorC[cont] = vetorA[i];
            cont++;
            cont2 = cont;
            for (int j = 0; j < qtd2; j++) {
                vetorC[cont2] = vetorB[j];
                cont2++;
            }
        }

        System.out.print(" A diferenÃ§a = ");
        for (int i = 0; i < cont2; i++) {

            if (vetorC[i] > 0) {

                System.out.print(vetorC[i] + " ");
            }
        }

    }

}
