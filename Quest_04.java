package Exercicio_22;

import java.util.Scanner;

public class Quest_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        int num[] = new int[10];
        
        for (int i = 0; i < num.length; i++){
            System.out.print("Entre com o valor da posição " + i+ ": ");
            num[i] = scan.nextInt();

        }
        
        int soma = 0;
        for (int i = 0; i < num.length; i++){
            soma += num[i];
        }
        
        System.out.print("Valores = ");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        
        double med = 0;
        System.out.println("\nSoma = " + soma);
        for (int i = 0; i < num.length; i++) {
            med = soma / num[i];
        }
        System.out.println("A média = " +med);
    }    
}

