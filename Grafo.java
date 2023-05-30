import java.util.*;

public class Grafo {
    private int numVertices;
    private Map<Integer, List<Integer>> adjacencias;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adjacencias = new HashMap<>();
        for (int i = 0; i < numVertices; i++) {
            adjacencias.put(i, new ArrayList<>());
        }
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem);
    }

    public void removerAresta(int origem, int destino) {
        adjacencias.get(origem).remove(Integer.valueOf(destino));
        adjacencias.get(destino).remove(Integer.valueOf(origem));
    }

    public List<Integer> obterVizinhos(int vertice) {
        return adjacencias.get(vertice);
    }

    public boolean existeAresta(int origem, int destino) {
        return adjacencias.get(origem).contains(destino);
    }

    public int obterNumVertices() {
        return numVertices;
    }

    public void exibirGrafo() {
        for (int i = 0; i < numVertices; i++) {
            List<Integer> vizinhos = adjacencias.get(i);
            System.out.print("Vértice " + i + " é adjacente a: ");
            for (Integer vizinho : vizinhos) {
                System.out.print(vizinho + " ");
            }
            System.out.println();
        }
    }

    /*
     * public void coberturaVertices() {
     * boolean[] visitado = new boolean[V];
     * Arrays.fill(visitado, false);
     * 
     * for (int v = 0; v < V; v++) {
     * if (!visitado[v]) {
     * for (Integer u : adjList[v]) {
     * if (!visitado[u]) {
     * visitado[u] = true;
     * visitado[v] = true;
     * break;
     * }
     * }
     * }
     * }
     */
}
