package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//Algoritmos de Ordenação:
//10 - Implementação de Algoritmo de Ordenação:
//Escolha um algoritmo de ordenação (ex: Bubble Sort, Quick Sort, Merge Sort) e implemente-o para ordenar um ArrayList de números inteiros de forma decrescente.

import java.util.ArrayList;
import java.util.Random;

public class Ex10_BubbleSorting {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            integers.add(random.nextInt(100));
        }
        System.out.println("Lista Original:");
        System.out.println(integers);
        System.out.println(bubbleSortIt(integers));
    }

    public static ArrayList<Integer> bubbleSortIt(ArrayList<Integer> list){

        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (list.get(j) < list.get(j + 1)) {

                    // swap
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
