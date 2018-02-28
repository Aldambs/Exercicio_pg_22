/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_22;

import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N[] = new int[30];
        
         for(int i = 0; i < N.length; i++){
             System.out.print("Entre com o valor na posição " + i + "º: ");
             N[i] = ler.nextInt();
         }
         
         System.out.println("O vetor é: ");
         for(int i = 0; i < N.length; i++){
             System.out.print(N[i]+ " ");            
         }
    }
}