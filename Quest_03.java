package Exercicio_22;

import java.util.Scanner;

public class Quest_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt1[] = new int[50];
        int vt2[] = new int[50];
        int vt3[] = new int[50];
        
        for(int i = 0; i < 5; i++){
            System.out.print("Digite o valor da posição " + i + " do vetor A:");
            vt1[i] = ler.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            System.out.print("Digite o valor da posição " + i + " do vetor B:");
            vt2[i] = ler.nextInt();
        }
        
         for(int i = 0; i < 5; i++){
            vt3[i] = vt1[i] + vt2[i];
        }
         
        System.out.print("Vetor A = ");
        for (int i = 0; i < 5; i++){
            System.out.print(vt1[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < 5; i++){
            System.out.print(vt2[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < 5; i++){
            System.out.print(vt3[i] + " ");
        }
        System.out.println();
    } 
}
