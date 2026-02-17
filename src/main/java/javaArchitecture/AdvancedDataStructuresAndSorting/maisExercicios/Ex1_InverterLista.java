package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//1 - Inversão de Lista:
//Escreva um programa para inverter os elementos de um ArrayList sem usar métodos prontos do java.

import java.util.ArrayList;
import java.util.Random;

public class Ex1_InverterLista {
    public static void main(String[] args){

        ArrayList<Integer> numbersList = new ArrayList<>();
        ArrayList<Integer> newNumbersList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            int randomNumber = random.nextInt(100);
            numbersList.add(randomNumber);
        }
        System.out.println("Lista original:\n" + numbersList);

        for(int i = numbersList.size() - 1; i >= 0; i--){
             newNumbersList.add(numbersList.get(i));
        }

        System.out.println("Lista Inversa:\n" + newNumbersList);
    }
}
