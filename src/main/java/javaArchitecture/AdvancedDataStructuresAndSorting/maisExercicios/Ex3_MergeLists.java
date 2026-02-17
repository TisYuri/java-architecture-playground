package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//3 - Mesclar Listas:
//Implemente uma função que receba duas ArrayLists e retorne uma nova lista que contenha todos os elementos das listas originais intercalados.

import java.util.ArrayList;
import java.util.Random;

public class Ex3_MergeLists {
    public static void main(String[] args){

        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> mergedList = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i < 5; i++){
            int randomNumber = random.nextInt(29);
            int randomNumber2= random.nextInt(29);
            listOne.add(randomNumber);
            listTwo.add(randomNumber2);
        }
        listOne.add(5);
        listOne.add(2);


        System.out.println("Lista 1: " + listOne);
        System.out.println("Lista 2: " + listTwo);

        mergedList = mergeLists(listOne, listTwo);

        System.out.println("Lista mesclada:\n" + mergedList);
    }
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo){
        ArrayList<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < listOne.size() || i < listTwo.size(); i++){
            if(i < listOne.size()){
                mergedList.add(listOne.get(i));
            }
            if(i < listTwo.size()){
                mergedList.add(listTwo.get(i));
            }
        }
        return mergedList;
    }
}
