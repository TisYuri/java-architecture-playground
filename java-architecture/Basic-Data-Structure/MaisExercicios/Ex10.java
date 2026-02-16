package MaisExercicios;


import java.util.ArrayList;
import java.util.Scanner;

class Item {
   private String itemName;
   private int amount;

    public Item(String item, int amount) {
        item = item.trim();
        this.itemName = item.toUpperCase();
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Item ='" + itemName + '\'' +
                ", Quantidade de:" + amount +
                '}';
    }
}


public class Ex10 {

    //Exercício 10: Desafio Final
    //Implemente um sistema de gerenciamento de estoque para uma loja, permitindo ao usuário adicionar, remover e atualizar itens no estoque. Utilize classes, listas e estruturas condicionais.

    public static void main(String[] args){

        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> stock = new ArrayList<>();

        while(isRunning){
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item ao estoque");
            System.out.println("2 - Remover item do estoque");
            System.out.println("3 - Atualizar quantidade de um item");
            System.out.println("4 - Mostrar estoque");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){

                case 1:

                    System.out.println("Digite o nome do produto que quer adicionar:");
                    String itemName = sc.nextLine();
                    System.out.println("Digite a quantidade de " + itemName + ":");
                    int amount = sc.nextInt();
                    sc.nextLine();

                    Item newItem = new Item(itemName, amount);
                    stock.add(newItem);
                break;

                case 2:
                    boolean found = false;

                    if(stock.isEmpty()){
                        System.out.println("Estoque está vazio, nada a remover.");
                        break;
                    }else{
                        System.out.println("Digite o nome do item que deve ser removido");
                        String itemToBeDeleted = sc.nextLine().trim().toUpperCase();

                        for(Item item : stock){
                            if(item.getItemName().equals(itemToBeDeleted)){
                                stock.remove(item);
                                found = true;
                                break;
                            }
                        }
                    }
                    if(!found) {
                        System.out.println("Item não encontrado");
                    }
                break;

                case 3:
                    if(stock.isEmpty()){
                        System.out.println("Estoque está vazio, nada a remover.");
                        break;
                    }
                    System.out.println("Digite o nome do item que deve ter a quatidade atualizada:");
                    String itemToBeUpdated = sc.nextLine().trim().toUpperCase();
                    System.out.println("Digite a nova quantidade do item: " + itemToBeUpdated);
                    int newAmount = sc.nextInt();
                    sc.nextLine();
                    found = false;

                    for(Item item : stock){
                        if(item.getItemName().equals(itemToBeUpdated)){
                            item.setAmount(newAmount);
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Item não encontrado");
                    }
                break;

                case 4:
                    if(stock.isEmpty()){
                        System.out.println("Estoque está vazio.");
                        break;
                    }else{
                        System.out.println("Estoque atual:");
                        for(Item item : stock){
                            System.out.println(item.toString());
                        }
                    }
                break;

                case 5:
                    System.out.println("Saindo...");
                    isRunning = false;
                break;

                default:
                    System.out.println("Opção invalida, tente novamente");
                break;
            }
        }
        sc.close();
    }
}

