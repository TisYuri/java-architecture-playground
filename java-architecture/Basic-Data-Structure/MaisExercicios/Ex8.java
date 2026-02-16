package MaisExercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8 {

    //Exercício 8: Estruturas Condicionais e Listas
    //Crie um programa que solicite ao usuário que insira uma lista de números inteiros e, em seguida, encontre e exiba o número que mais se repete.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os numeros da lista. quando terminar digite -1");

        int num = 0;
        ArrayList<Integer> intList = new ArrayList<>();

        while(true){
            num = sc.nextInt();
            if(num == -1) break;
            intList.add(num);
        }

        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
        int i;
        for(int number : intList){
            numberFrequency.put(number, numberFrequency.getOrDefault(number, 0) + 1);
        }

        int mostRepetedNumber = 0;
        int hightsOccurence = 0;

        for(Map.Entry<Integer, Integer> entry : numberFrequency.entrySet()){
            if(entry.getValue() > hightsOccurence){
                hightsOccurence = entry.getValue();
                mostRepetedNumber = entry.getKey();
            }
        }

        System.out.println("O numero " + mostRepetedNumber + " foi o que mais se repetiu, ele se repetiu " + hightsOccurence + " vezes.");

        sc.close();
    }

}
