package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//4 - Busca Binária:
//Implemente um algoritmo de busca binária para encontrar um elemento específico em um array ordenado de inteiros. Retorne a posição do número ou -1 se não for encontrado.

public class Ex4__BuscaBinaria {

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return binarySearch(array, target, left, middle - 1);
        } else {
            return binarySearch(array, target, middle + 1, right);
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int target = 60;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Número encontrado no índice: " + result);
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}
