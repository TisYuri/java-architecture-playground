package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//1 - Implementação da Árvore Binária:
//Crie uma classe em Java para representar uma árvore binária e implemente métodos para inserir elementos, percorrer a árvore em pré-ordem, pós-ordem e em ordem.

import java.util.Random;

public class Ex1__ArvoreBinaria {

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    // Insert (BST logic)
    void insert(int value) {
        root = insert(root, value);
    }

    Node insert(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);

        return node;
    }

    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Random random = new Random();

        Ex1__ArvoreBinaria tree = new Ex1__ArvoreBinaria();

        tree.insert(random.nextInt(100));
        tree.insert(random.nextInt(100));
        tree.insert(random.nextInt(100));
        tree.insert(random.nextInt(100));
        tree.insert(random.nextInt(100));

        System.out.println("InOrder:");
        tree.inOrder(tree.root);

        System.out.println("\nPreOrder:");
        tree.preOrder(tree.root);

        System.out.println("\nPostOrder:");
        tree.postOrder(tree.root);
    }
}
