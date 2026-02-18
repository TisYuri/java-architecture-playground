package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//2 - Validação de BST:
//Escreva um método para verificar se uma árvore binária é uma árvore binária de busca (BST).

import java.util.Random;

public class Ex2__ValidacaoBTS {

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    static boolean isBST(Node node, int min, int max) {
        if (node == null) return true;

        if (node.value <= min || node.value >= max)
            return false;

        return isBST(node.left, min, node.value) &&
                isBST(node.right, node.value, max);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}

