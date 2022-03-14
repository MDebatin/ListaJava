public class Nodo {
    public int matricula;
    public int idade;
    public Nodo proximo;
    public Nodo anterior;

    Nodo(int mtr, int idd) {
        matricula = mtr;
        idade = idd;
        proximo = null;
        anterior = null;
    }
}

