import java.util.Date;import java.util.Scanner;

public class Usuario {

    Scanner scanner = new Scanner(System.in);

    // ATRIBUTOS
    private String email;
    private String senha;
    private String nome;
    private String nickname;
    private String pais;
    private int aniversario;

    // CONSTRUTORES
    public Usuario(String email, String senha, String nome, String nickname, String pais, int aniversario){
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.nickname = nickname;
        this.pais = pais;
        this.aniversario = aniversario;
    }

    public Usuario(){
        this("email@gmail.com", "1234", "Marcelo", "marcelo20", "Brasil", 12/02/2000);
    }

    //GETTERS
    public String getNickname(){
        return nickname;
    }

    public String getSenha(){
        return senha;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }
    //SETTERS

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }


    //MÉTODOS
    public void logar(){
        System.out.println("Informe seu email: ");
        email = scanner.nextLine();
        System.out.println("Informe sua senha: ");
        senha = scanner.nextLine();

    }

    public void comprarJogo(){
        System.out.println("Jogo comprado");
    }
}
