package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//10 - Ordenação de Grafos:
//Implemente um algoritmo para ordenar os vértices de um grafo, de acordo com a topologia das conexões entre eles.

import java.util.*;

public class Ex10__OrdenacaoDeGrafos {

    static class Graph {

        private Map<Integer, List<Integer>> adj = new HashMap<>();

        public void addVertex(int v) {
            adj.putIfAbsent(v, new ArrayList<>());
        }

        public void addEdge(int from, int to) {
            adj.get(from).add(to);
        }

        public List<Integer> topologicalSort() {

            Set<Integer> visited = new HashSet<>();
            Stack<Integer> stack = new Stack<>();

            for (int vertex : adj.keySet()) {
                if (!visited.contains(vertex)) {
                    dfs(vertex, visited, stack);
                }
            }

            List<Integer> result = new ArrayList<>();

            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }

            return result;
        }

        private void dfs(int vertex, Set<Integer> visited, Stack<Integer> stack) {

            visited.add(vertex);

            for (int neighbor : adj.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    dfs(neighbor, visited, stack);
                }
            }

            stack.push(vertex);
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph();

        for (int i = 1; i <= 6; i++) {
            graph.addVertex(i);
        }

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);

        List<Integer> result = graph.topologicalSort();

        System.out.println("Topological Order: " + result);
    }
}
