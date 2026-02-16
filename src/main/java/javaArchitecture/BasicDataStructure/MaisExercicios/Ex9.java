package MaisExercicios;

//Exercício 9: Programação Orientada a Objetos
//Crie uma classe Pessoa com atributos como nome, idade e endereço. Implemente um programa que permite ao usuário criar e gerenciar uma lista de pessoas.


import java.util.ArrayList;
import java.util.Scanner;

class PessoaEx {
    private String nome;
    private int idade;
    private String endereco;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public PessoaEx(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}


public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PessoaEx> peopleList = new ArrayList<>();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Mostrar lista de pessoas");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (option) {
                    case 1:
                        System.out.print("Digite o nome da pessoa: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite a idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o endereço: ");
                        String endereco = scanner.nextLine();

                        PessoaEx novaPessoa = new PessoaEx(nome, idade, endereco);
                        peopleList.add(novaPessoa); // Usei o nome correto da lista aqui
                        System.out.println("Pessoa adicionada com sucesso!");
                        break;

                    case 2:
                        System.out.println("\n--- Lista de Pessoas ---");
                        if (peopleList.isEmpty()) {
                            System.out.println("A lista está vazia.");
                        } else {
                            for (PessoaEx person : peopleList) {
                                System.out.println(person);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        scanner.close();
    }
}
