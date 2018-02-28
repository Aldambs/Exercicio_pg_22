package Exercicio_22;

import java.util.Scanner;

public class Quest_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetorA[] = new int[50];
        int vetorB[] = new int [50];
        int vetorC[] = new int [50];
        int indice = 0; 
        
        for(int i = 0; i < 50; i++){
            System.out.print("DIGITE O " +i+ " VALOR A: ");
            vetorA[i] = ler.nextInt();                             
        }
        for (int i = 0; i < 50; i++) {
            System.out.print("DIGITE O " +i+ " VALOR B: ");
            vetorB[i] = ler.nextInt();
        }
       
        for (int i = 0; i < 50; i++) {
            if(vetorA[i] == vetorB[i]){
                vetorC[indice] = vetorA[i];
                indice++;
            }
        }
        System.out.println("A INTERSEÇÃO DE A e B: ");
        for (int i = 0; i < indice; i++) {
            System.out.println(vetorC[i]);
        }
    }
    
}
