public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);

        grafo.exibirGrafo();

        System.out.println("Vizinhos do vértice 1: " + grafo.obterVizinhos(1));
        System.out.println("O vértice 0 é adjacente ao vértice 4? " + grafo.existeAresta(0, 4));

        grafo.removerAresta(1, 4);
        System.out.println("Após remover a aresta entre os vértices 1 e 4:");
        grafo.exibirGrafo();
    }
}