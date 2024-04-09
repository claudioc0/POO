import java.util.ArrayList;
import java.util.Date;

public class Jogo {

    //ATRIBUTOS
    protected String nome;
    protected double preco;
    protected String tipo;
    protected String sobre;
    protected int anoLancamento;
    protected String review;
    protected String desenvolvedor;

    //CONSTRUTORES
    public Jogo(String nome, double preco, String tipo, String sobre, int anoLancamento, String review, String desenvolvedor){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.sobre = sobre;
        this.anoLancamento = anoLancamento;
        this.review = review;
        this.desenvolvedor = desenvolvedor;
    }

    public Jogo(){
        this("Tony Hawk's Pro Skater 2",99.00 ,"Esporte", "Tony Hawk's Pro Skater 2 é o segundo jogo da série Tony Hawk's. Foi desenvolvido pela Neversoft e publicado pela Activision em 2000.", 2000, "5 Estrelas", "Activision");
    }

    //GETTERS
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public String getTipo(){
        return tipo;
    }

    public String getSobre(){
        return sobre;
    }

    public String getDesenvolvedor(){
        return desenvolvedor;
    }

    //SETTERS
    public void setReview(String review){
        this.review = review;
    }

    //MÉTODOS
    public void comprarJogo(){
        System.out.println("Jogo comprado");
    }

    public void visualizarJogos(){
        System.out.println("Lista de jogos disponíveis:");
        System.out.println("Jogo: " + nome + "- R$" + preco);
    }

    public void adicionarReview(String novaReview) {
        this.review = novaReview;
    }
}

