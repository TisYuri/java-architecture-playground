package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//5 - Inversão com Pilha:
//Implemente um método para inverter a ordem dos elementos em um ArrayList utilizando uma pilha.

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Random;

public class Ex5_StackToInvertArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(20));
        }
        System.out.println("List" + list);

        Deque<Integer> stack = new ArrayDeque<>(list);
        list.clear();
        while (!stack.isEmpty()) {
            list.add(0, stack.pollFirst());
        }
        System.out.println("Stack: " + stack);
        System.out.println("List: " + list);
    }
}
