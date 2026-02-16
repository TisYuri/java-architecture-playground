package unidade1;

import java.util.Scanner;

public class Ex2 {

    //Exercício 2: Estruturas Condicionais
    //Escreva um programa que leia um número e determine se ele é par ou ímpar. Imprima o resultado na tela.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float number = sc.nextInt();

        if(number % 2 != 0){
            System.out.println("O Numero é impar");
        }
        else {
            System.out.println("O Numero é par");
        }

        sc.close();
    }

}
