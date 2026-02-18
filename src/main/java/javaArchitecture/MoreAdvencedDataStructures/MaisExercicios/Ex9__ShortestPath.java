package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

import java.util.*;

public class Ex9__ShortestPath {

    static class Graph {

        private Map<Integer, Map<Integer, Integer>> adjacencyList;

        public Graph() {
            adjacencyList = new HashMap<>();
        }

        public void addVertex(int vertex) {
            adjacencyList.putIfAbsent(vertex, new HashMap<>());
        }

        public void addEdge(int source, int destination, int weight) {
            adjacencyList.get(source).put(destination, weight);
            adjacencyList.get(destination).put(source, weight); // Undirected
        }

        public List<Integer> shortestPath(int source, int destination) {

            Map<Integer, Integer> distance = new HashMap<>();
            Map<Integer, Integer> predecessors = new HashMap<>();

            PriorityQueue<Integer> priorityQueue =
                    new PriorityQueue<>(Comparator.comparingInt(distance::get));

            for (int vertex : adjacencyList.keySet()) {
                distance.put(vertex, Integer.MAX_VALUE);
                predecessors.put(vertex, -1);
            }

            distance.put(source, 0);
            priorityQueue.add(source);

            while (!priorityQueue.isEmpty()) {

                int current = priorityQueue.poll();

                for (int neighbor : adjacencyList.get(current).keySet()) {

                    int newDistance =
                            distance.get(current) +
                                    adjacencyList.get(current).get(neighbor);

                    if (newDistance < distance.get(neighbor)) {
                        distance.put(neighbor, newDistance);
                        predecessors.put(neighbor, current);
                        priorityQueue.add(neighbor);
                    }
                }
            }

            if (distance.get(destination) == Integer.MAX_VALUE) {
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

        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 4, 5);
        graph.addEdge(2, 5, 3);
        graph.addEdge(3, 6, 7);
        graph.addEdge(3, 7, 4);

        int source = 1;
        int destination = 6;

        List<Integer> shortestPath = graph.shortestPath(source, destination);

        if (shortestPath.isEmpty()) {
            System.out.println("Não foi encontrado um caminho entre:  " + source + " e " + destination);
        } else {
            System.out.println("O menor caminho é: " + shortestPath);
        }
    }
}
