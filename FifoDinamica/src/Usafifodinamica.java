import javax.swing.JOptionPane;
public class Usafifodinamica {
    public static void main(String[] args)
    {
        int opcao, matricula, idade;
        String entra;
        Fifo minha;
        minha= new Fifo();
        do
        {entra = JOptionPane.showInputDialog("\n\t\tMENU\n\n\t1 - Inserir \n\t2 - Retirar \n\t3 - Mostrar \n\t4 - Mostrar Invertido \n\t5 - Detonar \n\t6 - Procurar " +
                "\n\t7 - Mais Velho \n\t8 - Média Idades \n\t9 - Cabeça \n\t10 - Ultimo \n\n\t11 - Vazar \n\n\tEscolha a Opção");
            opcao = Integer.parseInt(entra);
            switch (opcao)
            {case 1: entra = JOptionPane.showInputDialog("Informe a Matricula");
                matricula = Integer.parseInt(entra);
                entra = JOptionPane.showInputDialog("Informe a Idade");
                idade = Integer.parseInt(entra);
                minha.inserir(matricula, idade);
                System.out.println("Matricula Inserida");
                break;

                case 2: if (minha.retirar() == -999)
                    System.out.print("Impossivel Retirar - UNDERFLOW");
                else
                    System.out.print("Elemento Retirado");
                    break;

                case 3: minha.mostrar();
                    break;

                case 4: minha.mostraraocontrario();
                    break;

                case 5: minha.detonar();
                    break;

                case 6: entra = JOptionPane.showInputDialog("Informe a Matricula");
                    matricula = Integer.parseInt(entra);
                    idade = 0;
                    minha.Procurar(matricula, idade);
                    break;

                case 7: minha.maisVelho();
                    break;

                case 8: minha.mediaIdades();
                    break;

                case 9: minha.cabeca();
                break;

                case 10: minha.ultimo();
                break;
            }
        } while (opcao !=11 );

    }
}




