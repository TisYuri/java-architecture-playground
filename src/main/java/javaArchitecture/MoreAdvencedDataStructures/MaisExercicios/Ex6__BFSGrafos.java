package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//6 - BFS em Grafos:
//Implemente o algoritmo de Busca em Largura (BFS) para encontrar o caminho mais curto entre dois nós em um grafo não ponderado.

import java.util.*;

public class Ex6__BFSGrafos {

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

        public List<Integer> bfs(int source, int destination) {

            Queue<Integer> queue = new LinkedList<>();
            Map<Integer, Integer> predecessors = new HashMap<>();
            Set<Integer> visited = new HashSet<>();

            queue.add(source);
            visited.add(source);
            predecessors.put(source, -1);

            while (!queue.isEmpty()) {

                int current = queue.poll();

                if (current == destination) {
                    break;
                }

                for (int neighbor : adjacencyList.get(current)) {

                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                        predecessors.put(neighbor, current);
                    }
                }
            }

            if (!visited.contains(destination)) {
                return new ArrayList<>();
            }

            List<Integer> path = new ArrayList<>();
            int step = destination;

            while (step != -1) {
                path.add(step);
                step = predecessors.get(step);
            }

            Collections.reverse(path);
            return path;
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

        int source = 1;
        int destination = 6;

        List<Integer> shortestPath = graph.bfs(source, destination);

        if (shortestPath.isEmpty()) {
            System.out.println("Não foi encontrado um caminho entre:  " + source + " e " + destination);
        } else {
            System.out.println("O menor caminho de " + source + " para " + destination + ": " + shortestPath);
        }
    }
}
