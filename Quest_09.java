package Exercicio_22;

import java.util.Scanner;

public class Quest_09 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int[] conjuntoA = new int[6];
        int[] conjuntoB = new int[6];
        int[] resut = new int[1];
        int num = 0;
        int num2 = 0;
        int cont = 0;

        do {

            for (int i = 0; i < conjuntoA.length; i++) {
                System.out.println("Entre com o número do conjunto A" +i+ ": ");
                conjuntoA[i] = ler.nextInt();
            }
            for (int j = 0; j < conjuntoB.length; j++) {
                System.out.println("Entre com o número do conjunto B" +j+ ": ");
                conjuntoB[j] = ler.nextInt();
            }
            for (int i = 0; i < conjuntoA.length; i++) {
                for (int j = 0; j < conjuntoB.length; j++) {
                    if (conjuntoA[i] == conjuntoB[j]) {
                        System.out.println("O número ocorre no conjunto A " +conjuntoB[j]);
                    } else {
                        System.out.println("O número não ocorre no conjunto A " +conjuntoB[j]);
                    }
                }
            }
            System.out.println("Quer sair  Digite (0) ");
            num = ler.nextInt();
            if (num == 0) {
                break;
            }
        } while (num != 0);

    }
}

