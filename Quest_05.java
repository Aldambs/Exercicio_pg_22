package Exercicio_22;

import java.util.Scanner;

public class Quest_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vtA[] = new int[10];
        int vtB[] = new int[10];
        int vtC[] = new int[10];
        
        for (int i = 0; i < vtA.length; i++) {
            System.out.print("Digite o valor de A " +i+ ": ");
            vtA[i] = ler.nextInt();
        }
        
        for (int i = 0; i < vtB.length; i++) {
            System.out.print("Digite o valor de B " +i+ ": ");
            vtB[i] = ler.nextInt();
        }
        
        for (int i = 0; i < vtC.length; i++) { 
            vtC[i] = vtA[i];
            vtC[i] = vtB[i];
        }
        int i = 0;
        System.out.println("O terceiro vetor = " +vtC[i]);
    }
    
}
