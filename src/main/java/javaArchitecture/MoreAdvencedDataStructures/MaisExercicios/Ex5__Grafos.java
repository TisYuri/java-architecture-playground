package javaArchitecture.MoreAdvencedDataStructures.MaisExercicios;

//5 - Representação de Grafos:
//Crie uma classe que represente um grafo em Java utilizando lista de adjacências ou matriz de adjacências.

import java.util.*;

public class Ex5__Grafos {

    private Map<Integer, List<Integer>> adjacencias;

    public Ex5__Grafos() {
        adjacencias = new HashMap<>();
    }
    
    public void addVertex(int vertice) {
        adjacencias.putIfAbsent(vertice, new ArrayList<>());
    }
    
    public void addEdge(int origem, int destino) {

        adjacencias.putIfAbsent(origem, new ArrayList<>());
        adjacencias.putIfAbsent(destino, new ArrayList<>());

        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem);
    }
    
    public List<Integer> getNeighbors(int vertice) {
        return adjacencias.getOrDefault(vertice, new ArrayList<>());
    }
    
    public void printGraph() {
        for (Integer vertice : adjacencias.keySet()) {
            System.out.println("Vértice " + vertice + " -> " + adjacencias.get(vertice));
        }
    }

    public static void main(String[] args) {

        Ex5__Grafos grafo = new Ex5__Grafos();

        grafo.addVertex(1);
        grafo.addVertex(2);
        grafo.addVertex(3);
        grafo.addVertex(4);

        grafo.addEdge(1, 2);
        grafo.addEdge(1, 3);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 4);

        grafo.printGraph();
    }
}
