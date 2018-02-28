package Exercicio_22;

import java.util.Scanner;

public class Quest_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[50];
        String nome[] = new String[50];
        int i;
        
        do {
            for (i = 0; i < 50; i++) {
                System.out.print("Digite o valor " + i + ": ");
                num[i] = ler.nextInt();
                System.out.print("Digite o nome do aluno " + i + ": ");
                nome[i] = ler.next();
            }
            
        } while (num[i] > 0);

        System.out.println("O nome e o número lido são: ");
        for (i = 0; i < 50; i++) {
            System.out.println(nome[i] + " , " + num[i]);

        }

    }
}
