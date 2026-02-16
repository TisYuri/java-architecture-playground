package MaisExercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex4 {

    //Exercício 4: Listas (ArrayList)
    //Implemente um programa que permita ao usuário adicionar e remover elementos de uma lista dinâmica (por exemplo, ArrayList) de números inteiros.

    public static void main(String[] args){
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integersList = new ArrayList<>();

        do{

            System.out.println("Escolha uma ação:");
            System.out.println("Digite 1 para adicionar um numero a lista:");
            System.out.println("Digite 2 para excluir um item da lista");
            System.out.println("Digite 3 para ver os itens da lista");
            System.out.println("Digite 0 para sair do programa");
            option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Digite o numero que vc quer adicionar:");
                    int newNumber = sc.nextInt();
                    integersList.add(newNumber);
                break;

                case 2:
                    if (integersList.isEmpty()) {
                        System.out.println("A lista está vazia. Nada para remover.");
                    }
                    else{
                        System.out.println("Digite o numero que vc quer adicionar:");
                        int numberToBeRemoved = sc.nextInt();
                        if(integersList.contains(numberToBeRemoved)){
                            integersList.remove(numberToBeRemoved);
                            System.out.println("Numero Removido");
                        }else{
                            System.out.println("Numero não encontrado na lista.");
                        }
                    }
                break;

                case 3:
                    IntStream.range(0, integersList.size())
                            .forEach(i -> System.out.println(i + " - " + integersList.get(i)));
                break;
            }
        }while(option != 0);
    }
}
