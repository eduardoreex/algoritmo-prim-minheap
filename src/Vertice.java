public class Vertice {
    int id;
    int chave;
    Vertice pai;

    public Vertice(int id, int chave) {
        this.id = id;
        this.chave = chave;
        this.pai = null;
    }

    @Override
    public String toString() {
        return "Vertice " + id + " (chave=" + chave + ")";
    }
}