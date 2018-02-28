package Exercicio_22;

import java.util.*;

public class Quest_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[100];
        int num[] = new int[vt.length];
        int aux;
        for (int i = 0; i < vt.length; i++) {
            System.out.println("Digite o número do vetor " +i+ ": ");
            num[i] = ler.nextInt();
        }
        for (int i = 0; i < vt.length; i++) {
            for (int j = i+1; j < vt.length; j++) {
                if(num[i] > num[j]){
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        System.out.print("Números na ordem crescente = ");
         for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");        
        }
    }
    
}
