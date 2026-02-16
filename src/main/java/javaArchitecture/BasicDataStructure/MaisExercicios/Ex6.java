package MaisExercicios;

import java.util.stream.IntStream;

public class Ex6 {

    //Exercício 6: Estruturas Condicionais e Laços
    //Escreva um programa que encontre todos os números primos entre 1 e 100 e imprima-os na tela.

    public static void main(String[] args){
        IntStream.range(1,101)
                .filter(i -> isPrime(i))
                .forEach(i -> System.out.println(i + " é primo"));
    }
    public static boolean isPrime(int num){
        if(num <= 2){
            return false;
        }

        int i;

        for(i = 2; i <= num/i ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
