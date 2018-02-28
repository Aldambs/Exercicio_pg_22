package Exercicio_22;

import java.util.*;

public class Quest_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a quantidade do vetor:");
        int n = ler.nextInt();
        int vt[] = new int[n];
        int maior = 0;
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número do vetor " +i+ ": ");
            vt[i] = ler.nextInt();
            cont = vt[i];
            if(maior < cont){
                maior = vt[i];
            }
        }
        Arrays.sort(vt);
        System.out.println(" ");
        System.out.print("Vetor = ");
        for (int i = 0; i < vt.length; i++) {
            System.out.print(vt[i] + " ");     
        }
        int pos = Arrays.binarySearch(vt, maior);
        System.out.println("\nA posição = " +pos);
        System.out.println("O maior número = " +maior);
    }
}
