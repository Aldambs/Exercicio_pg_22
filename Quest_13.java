package Exercicio_22;

import java.util.Scanner;

public class Quest_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[4];
        int rp[] = new int[vt.length];
        
        for (int i = 0; i < vt.length; i++) {
            System.out.println("Digite o número:");
            vt[i] = ler.nextInt();
            rp[i] = 0;
        }

        for (int i = 0; i < vt.length; i++) {
            for (int j = 0; j < vt.length; j++) {
                if(i == j){
                    if(vt[i] == vt[j]);
                    rp[i] = rp[i] + 1;
                }
            }
        }
        System.out.print("Quantidade de repetições = ");
        for (int i = 0; i < rp[1]; i++) {
            System.out.print(rp[i]+ " ");
        }
    }
}
