package Exercicio_22;

import java.util.Scanner;

public class Quest_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vt = new int[4];
        int[] valor_S = new int[vt.length];

        for (int i = 0; i < vt.length; i++) {
            System.out.println("Entre com o valor de vetor " +i+ ": ");
            vt[i] = ler.nextInt();
        }
        for (int i = 0; i < valor_S.length; i++) {
            valor_S[i] += (vt[i] - vt[1] + 1) * 2;
        }
       
        System.out.print("Valor de S = ");
        for (int i = 0; i < valor_S.length; i++) {
            System.out.print(valor_S[i] + " ");
        }
    }
}
