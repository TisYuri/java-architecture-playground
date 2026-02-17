package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//2 - Remoção de Elementos Duplicados:
//Crie um metodo para remover elementos duplicados de um ArrayList.

import java.util.ArrayList;

public class Ex2_RemoveDuplicatesFromList {
    public static void main(String[] args){

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(10);
        numbersList.add(5);
        numbersList.add(2);
        numbersList.add(10);
        numbersList.add(2);
        numbersList.add(7);

        for(int i = 0; i < numbersList.size(); i++){
            for(int j = i + 1; j < numbersList.size(); j++){
                if(numbersList.get(i).equals(numbersList.get(j))){
                    numbersList.remove(j);
                    j--;
                }
            }
        }

        System.out.println("Lista após remover duplicadas:\n" + numbersList);
    }
}
