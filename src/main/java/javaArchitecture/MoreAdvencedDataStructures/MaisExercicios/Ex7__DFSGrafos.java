package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//7 - DFS em Grafos:
//Escreva um método para realizar a Busca em Profundidade (DFS) em um grafo, exibindo todos os vértices visitados.

import java.util.*;

public class Ex7__DFSGrafos {

    static class Graph {

        private Map<Integer, List<Integer>> adjacencyList;

        public Graph() {
            adjacencyList = new HashMap<>();
        }

        public void addVertex(int vertex) {
            adjacencyList.putIfAbsent(vertex, new ArrayList<>());
        }

        public void addEdge(int source, int destination) {
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); // Undirected graph
        }

        public void dfs(int startVertex) {
            Set<Integer> visited = new HashSet<>();
            dfsRecursive(startVertex, visited);
        }

        private void dfsRecursive(int vertex, Set<Integer> visited) {

            visited.add(vertex);
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    dfsRecursive(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph();

        for (int i = 1; i <= 7; i++) {
            graph.addVertex(i);
        }

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);

        System.out.println("Vertices visitados em DFS:");
        graph.dfs(1);
    }
}
