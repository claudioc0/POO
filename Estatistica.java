public class Estatistica extends Jogo {
    //ATRIBUTOS
    private int data;
    private int numeroVendas;
    private int jogadoresOnline;

    //CONSTRUTORES
    public Estatistica(String nome, double preco, String tipo, String sobre, int anoLancamento, String review, String desenvolvedor, int data, int numeroVendas ,int jogadoresOnline){
        super(nome, preco, tipo, sobre, anoLancamento, review, desenvolvedor);
        this.data = data;
        this.numeroVendas = numeroVendas;
        this.jogadoresOnline = jogadoresOnline;
    }

    public Estatistica(){
        this("Counter-Strike 2", 0.00, "Acao", "Há mais de duas décadas, o Counter-Strike oferece uma experiência competitiva de elite moldada por " +
                "milhões de jogadores mundialmente. Agora, o próximo capítulo da história do CS vai começar. Isso é Counter-Strike 2.", 2023, "Bom","Valve" ,06/03/2024, 604, 955535 );
    }

    //GETTERS
    public int getData(){
        return data;
    }

    public int getJogadoresOnline() {
        return jogadoresOnline;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public String getNomeJogo() {
        return nome;
    }

    //MÉTODOS
    public void visualizarMaisJogados(){
        System.out.println("Nome do jogo");
    }

    public void visualizarMaisVendidos(){
        System.out.println("Nome dos mais vendidos");
    }
}
