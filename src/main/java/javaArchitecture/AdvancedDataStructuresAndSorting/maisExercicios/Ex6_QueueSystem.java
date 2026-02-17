package javaArchitecture.AdvancedDataStructuresAndSorting.maisExercicios;

//Filas:
//6 - Implementação de um Sistema de Fila de Espera:
//Crie um sistema simples de fila de espera com funcionalidades de adicionar, remover e exibir elementos.

import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class Ex6_QueueSystem {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int option = 10;


        while(option != 0){
            System.out.println("Bem-vindo ao gerenciador de Fila\n" +
                    "Escolha um numero para as opções abaixo:");
            System.out.println("Opção 1: Adicionar um cliente a fila. Digite o nome do cliente.");
            System.out.println("Opção 2: Atender o primeiro cliente da fila.");
            System.out.println("Opção 3: Exibir a fila de espera.");
            System.out.println("Opção 4: Para sair.");
            System.out.println("--------------------------------------------------");

            try{
                option = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Por favor digite um numero válido\n");
            }


            switch (option){
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.println("Cliente adicionado com sucesso!\n");

                    if(!queue.offer(nome)){
                        System.out.println("Erro ao adicionar o nome do cliente.\n Tente novamente.");
                    }
                break;
                case 2:
                    System.out.println("O cliente: " + queue.poll() + " será atendido agora.\n\n");
                break;
                case 3:
                    System.out.println("\n--------------------------------------");
                    int index = 1;
                    for(String cliente: queue){
                        System.out.println("Posição: " + index + " - " + cliente);
                        index++;
                    }
                    System.out.println("--------------------------------------\n");
                break;
                default:
                    System.out.println("Digite um numero valido por favor.\n");
                break;
            }
        }
        sc.close();
    }
}
