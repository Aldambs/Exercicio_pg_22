package Exercicio_22;

import java.util.Scanner;

public class Quest_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[10];
        
        for(int i = 0; i < vt.length; i++){
            System.out.print("Entre com o valor " +i+ ":");
            vt[i] = ler.nextInt();
        }
        System.out.println("O número inverso = ");
        for (int j = vt.length-1; j >= 0; j--) {
            System.out.print(" " +vt[j]);
        }
    }
    
}
