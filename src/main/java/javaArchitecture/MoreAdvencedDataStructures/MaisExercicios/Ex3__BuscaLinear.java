package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//3 - Busca Linear:
//Escreva um método que realize uma busca linear em um array de inteiros para encontrar um número específico e retorne a posição do número ou -1 se não for encontrado.

import java.util.ArrayList;
import java.util.Random;

public class Ex3__BuscaLinear {
    public static void main(String[] args){

        Random random = new Random();
        ArrayList<Integer> integerList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            integerList.add(random.nextInt(100));
        }


        System.out.println("Lista gerada :\n" + integerList);

        int numberToBeSearched = integerList.getLast();
        System.out.println("\nO numero que será pesquisado é: " + numberToBeSearched);
        System.out.println("Numero encontrado! O indice dele é: " + liniarSearch(integerList, numberToBeSearched));


        int randomNumber = random.nextInt(100);

        System.out.println("O numero que será pesquisado é: " + randomNumber);

        if(liniarSearch(integerList, randomNumber) != -1){
            System.out.println("Numero encontrado! O indice dele é: " + liniarSearch(integerList, randomNumber));
        }else{
            System.out.println("Numero '" + randomNumber + "' Não encontrado.");
        }


    }
    static int liniarSearch(ArrayList<Integer> list, int searchedNumber){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == searchedNumber){
                return i;
            }
        }
        return -1;
    }

}
