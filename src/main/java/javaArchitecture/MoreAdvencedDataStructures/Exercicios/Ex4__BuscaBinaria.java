package javaArchitecture.MoreAdvencedDataStructures.Exercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ex4__BuscaBinaria {

    public static void main(String[] args) {

        Random random = new Random(1);
        ArrayList<Integer> listIntegers = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            listIntegers.add(random.nextInt(100));
        }
        listIntegers.sort(null);
        System.out.println(listIntegers);
        int searchedNumber = 78;

        int posicao = buscaBinaria(listIntegers, searchedNumber, 0, listIntegers.size() - 1);

        if (posicao != -1) {
            System.out.println("O número " + searchedNumber +
                    " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O número " + searchedNumber +
                    " não foi encontrado no array.");
        }
    }

    public static int buscaBinaria(ArrayList<Integer> array, int numeroProcurado, int inicio, int fim) {

        if (inicio > fim) {
            return -1; // Caso base: não encontrado
        }

        int meio = (inicio + fim) / 2;

        if (array.get(meio) == numeroProcurado) {
            return meio;
        }
        else if (array.get(meio) < numeroProcurado) {
            return buscaBinaria(array, numeroProcurado, meio + 1, fim);
        }
        else {
            return buscaBinaria(array, numeroProcurado, inicio, meio - 1);
        }
    }
}
