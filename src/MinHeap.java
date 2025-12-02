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
    private void heapifyMin(int i) {
        int esq = filhoEsquerdo(i);
        int dir = filhoDireito(i);
        int menor = i;

        if (esq < tamanho && heap[esq].chave < heap[menor].chave) {
            menor = esq;
        }

        if (dir < tamanho && heap[dir].chave < heap[menor].chave) {
            menor = dir;
        }

        if (menor != i) {
            trocar(i, menor);
            heapifyMin(menor);
        }
    }

    public Vertice extractMin() {
        if (tamanho == 0) {
            return null;
        }

        if (tamanho == 1) {
            tamanho--;
            posicao[heap[0].id] = -1;
            return heap[0];
        }

        Vertice min = heap[0];
        heap[0] = heap[tamanho - 1];
        posicao[heap[0].id] = 0;
        tamanho--;
        posicao[min.id] = -1;
        heapifyMin(0);

        return min;
    }
}