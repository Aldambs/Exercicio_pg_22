package Exercicio_22;

import java.util.*;

public class Quest_14 {

    /**
     * Ler dois vetores com número inteiros, com no máxima 100 elementos cada, 
     * onde o número de elementos a serem lidos em cada vetor também serão lidos.
     * Sabendo que os dois vetores lidos já estarão ordenados gere um terceiro 
     * vetor também ordenado
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt1[] = new int[4];
        int vt2[] = new int[vt1.length];
        int vt3[] = new int[vt1.length];
        int aux, qtd;
        
        do{
            System.out.println("Digite o valor do vetor (<100):"); 
            qtd = ler.nextInt();
        }while(qtd <= 0 || qtd > 100);
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o primeiro valor do vetor " +i+ ": ");
            vt1[i] = ler.nextInt();
        }
        for (int i = 0; i < qtd; i++) {
            for (int j = i+1; j < qtd; j++) {
                if(vt1[i] > vt1[j]){
                    aux = vt1[i];
                    vt1[i] = vt1[j];
                    vt1[j] = aux;
                }
            }
        }
       
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o segundo valor do vetor " +i+ ": ");
            vt2[i] = ler.nextInt();
        }
        for (int i = 0; i < qtd; i++) {
            for (int j = i+1; j < qtd; j++) {
                if(vt2[i] > vt2[j]){
                    aux = vt2[i];
                    vt2[i] = vt2[j];
                    vt2[j] = aux;
                }
            }
        }
        
        System.out.println("");
        for (int i = 0; i < qtd; i++) {
            if (vt1[i] == vt2[i]) {
                vt3[i] = vt2[i];
                vt2[i] = vt3[i];
            } else {
                vt3[i] = vt1[i];
            }
        }

        System.out.print("Números ordenados = ");
        for (int i = 0; i < qtd; i++) {
            System.out.print(vt3[i] + " ");
        }
    }
}
