package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//8 - Mínimo de uma BST:
//Escreva um método para encontrar o menor valor em uma árvore binária de busca.

public class Ex8__BST {

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert (BST logic)
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    public int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node node) {

        if (node == null) {
            throw new IllegalStateException("Arvore está vazia");
        }

        if (node.left == null) {
            return node.value;
        }

        return findMinRecursive(node.left);
    }

    public static void main(String[] args) {

        Ex8__BST tree = new Ex8__BST();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);

        int minValue = tree.findMin();

        System.out.println("O menor valor na BST é: " + minValue);
    }
}
