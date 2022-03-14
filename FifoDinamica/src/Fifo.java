public class Fifo {
    private Nodo comeco;
    private Nodo fim;

    Fifo() {
        comeco = null;
        fim = null;
    }

    public void inserir(int quem, int quanto) {
        Nodo aux;
        aux = new Nodo(quem, quanto);
        if (comeco == null) {
            comeco = aux;
        } else {
            fim.proximo = aux;
        }
        fim = aux;
    }

    public int retirar() {
        int aux = -999;
        if (comeco != null) {
            aux = fim.matricula;
            comeco = comeco.proximo;
        }
        return aux;
    }

    public void mostrar() {
        Nodo aux;
        if (comeco == null) {
            System.out.println("Lista Vazia");
            return;
        }
        System.out.println("\nVeja a Lista: ");
        aux = comeco;
        while (aux != null) {
            System.out.println("Matrícula: " + aux.matricula + " Idade: " + aux.idade);
            aux = aux.proximo;
        }
    }

    public void mostraraocontrario() {
        Nodo aux;
        if (comeco == null) {
            System.out.println("Lista Vazia");
            return;
        }
        System.out.println("\nVeja a lista ao contrário: ");
        aux = fim;
        while (aux != null) {
            System.out.println("Matrícula: " + aux.matricula + " Idade: " + aux.idade);
            aux = aux.anterior;
        }
    }

    public void detonar() {
        fim = null;
        comeco = null;
    }

    public void Procurar(int quem, int quanto) {
        Nodo aux = null;
        Nodo Procura = null;
        int achou = 1;
        Procura = new Nodo(quem, quanto);
        if (comeco == null) {
            System.out.println("Lista Vazia");
            return;
        } else if (comeco != null) {
            aux = comeco;
        }
        while (aux != null) {
            if(Procura.matricula == aux.matricula){
                System.out.println("O número que você procurou está na lista!");
                achou = achou + 1;
            }
            aux = aux.proximo;
        }
        if(achou == 1)
            System.out.println("O número procurado não está na lista");
    }

    public void maisVelho() {
        Nodo aux = null;
        int idademaior = -999;
        if (comeco == null) {
            System.out.println("Lista Vazia");
            return;
        } else if (comeco != null) {
            aux = comeco;
            idademaior = aux.idade;
            aux = aux.proximo;
        }
        while (aux != null) {
            if (aux.idade > idademaior) {
                idademaior = aux.idade;
            }
            aux = aux.proximo;
        }
        System.out.println("O mais velho é: " + idademaior);
    }

    public void mediaIdades() {
        Nodo aux = null;
        int somaidades = 0;
        int media = 0;
        int rodou = 1;
        if (comeco == null) {
            System.out.println("Lista Vazia");
            return;
        } else if (comeco != null) {
            aux = comeco;
            somaidades = aux.idade;
            aux = aux.proximo;
        }
        while (aux != null) {
            somaidades = somaidades + aux.idade;
            rodou = rodou + 1;
            aux = aux.proximo;
        }
        media = somaidades / rodou;
        System.out.println("A média das idades é: " +media );
    }

    public int cabeca(){
        if (comeco == null)
            return -999;
        System.out.println("O primeiro da fila é: " +comeco.matricula);
        return comeco.matricula;
    }

    public int ultimo(){
        if (comeco == null){
            return -999;
        }else{
            System.out.println("O último da fila é: " +fim.matricula);
            return fim.matricula;
        }
    }





}
