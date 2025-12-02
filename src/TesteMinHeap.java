public class TesteMinHeap {
    public static void main(String[] args) {
        System.out.println("=== TESTE EXTRACT-MIN ===\n");

        MinHeap heap = new MinHeap(10);

        heap.insert(new Vertice(0, 0));
        heap.insert(new Vertice(1, 4));
        heap.insert(new Vertice(2, 8));
        heap.insert(new Vertice(3, 2));
        heap.insert(new Vertice(4, 5));
        heap.insert(new Vertice(5, 10));

        System.out.println("Heap criado com 6 vertices\n");
        System.out.println("Executando Extract-Min:\n");

        while (!heap.isEmpty()) {
            Vertice min = heap.extractMin();
            System.out.println("Extraido: " + min);
        }

        System.out.println("\n=== TESTE DECREASE-KEY ===\n");

        MinHeap heap2 = new MinHeap(5);
        heap2.insert(new Vertice(0, 10));
        heap2.insert(new Vertice(1, 20));
        heap2.insert(new Vertice(2, 15));

        System.out.println("Antes: Min = " + heap2.getMin());
        heap2.decreaseKey(1, 5);
        System.out.println("Depois de decreaseKey(1, 5): Min = " + heap2.getMin());

        System.out.println("\nExtraindo:");
        while (!heap2.isEmpty()) {
            System.out.println(heap2.extractMin());
        }
    }
}