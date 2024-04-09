import java.sql.SQLOutput;

public class Comunidade extends Jogo{
    //ATRIBUTOS
    private String sobreComunidade;
    private String mensagensForum;
    private String noticiasComunidade;
    Jogo jogo;



    //CONSTRUTORES
    public Comunidade( String nome, double preco, String tipo, String sobre, int anoLancamento, String review, String desenvolvedor, String sobreComunidade, String mensagensForum, String noticiasComunidade){
        super(nome, preco, tipo, sobre, anoLancamento, review, desenvolvedor);
        this.sobreComunidade = sobreComunidade;
        this.mensagensForum = mensagensForum;
        this.noticiasComunidade = noticiasComunidade;
    }

    public Comunidade(){
        this("TEKKEN 8", 270.00, "Luta", "Prepare-se para o próximo capítulo da lendária franquia de jogos de luta: TEKKEN 8", 2024, "Cansei de apanhar no 7 e vim apanhar no 8","Bandai Namco" ,"Prepara-te para o próximo capítulo da lendária série de jogos de luta, o TEKKEN 8.", "Mensagens do fórum", "Notícias sobre o jogo do fórum");
    }

    //GETTERS
    public String getNomeJogo(){
        return nome;
    }

    public String getSobreComunidade(){
        return sobreComunidade;
    }

    public String getMensagensForum() {
        return mensagensForum;
    }

    public String getNoticiasComunidade() {
        return noticiasComunidade;
    }

    //SETTERS


    public void setMensagensForum(String mensagensForum) {
        this.mensagensForum = mensagensForum;
    }

    public void acessarPaginaInicial(){
        System.out.println("Bem vindo");
    }
    public void visualizarDiscussoes(){
        System.out.println("Discussôes");
    }

    public void visualizarJogos(){
        System.out.println("Comunidades do jogo " + jogo.nome + ": ");
        System.out.println(jogo.nome);
    }





}


