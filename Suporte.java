import java.util.Scanner;

public class Suporte {

    //ATRIBUTOS
    private boolean jogoSuporte; // informar sobre qual jogo
    private boolean comprasSuporte;
    private boolean minhaContaSuporte;
    private boolean clienteSuporte;
    private String problema;

    //CONSTRUTORES
    public Suporte(boolean jogoSuporte, boolean comprasSuporte, boolean minhaContaSuporte,boolean clienteSuporte , String problema){
        this.comprasSuporte = comprasSuporte;
        this.problema = problema;
    }

    public Suporte(){
        this(false, true, false, false, "Problema ao comprar com o cartão de crédito");
    }

    //GETTERS
    public String getProblema(){
        return problema;
    }


    //SETTERS
    public void setProblema(String problema){
        this.problema = problema;
    }

    //MÉTODOS
    public void selecionarProblema(){
        System.out.println("Selecione o problema: \nJogos, softwares, etc.\nCompras \nMinha conta \nCliente");
    }
    public void contatarSuporte(){
        System.out.println("Informe o problema: ");
        Scanner scanner = new Scanner(System.in);
        problema = scanner.nextLine();

    }

}
