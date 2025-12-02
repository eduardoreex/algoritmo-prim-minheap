public class MinHeap {
    private Vertice[] heap;
    private int tamanho;
    private int capacidade;
    private int[] posicao;

    public MinHeap(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.heap = new Vertice[capacidade];
        this.posicao = new int[capacidade];
        for (int i = 0; i < capacidade; i++) {
            posicao[i] = -1;
        }
    }

    private int pai(int i) {
        return (i - 1) / 2;
    }

    private int filhoEsquerdo(int i) {
        return 2 * i + 1;
    }

    private int filhoDireito(int i) {
        return 2 * i + 2;
    }

    private void trocar(int i, int j) {
        posicao[heap[i].id] = j;
        posicao[heap[j].id] = i;
        Vertice temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }
}