import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Bem vindo a Steam!");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Logar");
            System.out.println("3 - Visualizar jogos");
            System.out.println("0 - Sair ");

            System.out.println("Escolha uma das opcoes: ");
            Scanner scanner = new Scanner(System.in);
            int respostaUser = scanner.nextInt();

            if (respostaUser == 1) {

                Usuario usuario = new Usuario();

                System.out.println("Insira seu nome: ");
                String nome = scanner.nextLine();
                usuario.setNome(nome);

                System.out.println("Insira seu email: ");
                String email = scanner.nextLine();
                usuario.setEmail(email);

                System.out.println("Insira sua senha: ");
                String senha = scanner.nextLine();
                usuario.setSenha(senha);

                System.out.println("Insira seu nickname: ");
                String nickname = scanner.nextLine();
                usuario.setNickname(nickname);

                System.out.println("Insira o seu país: ");
                String pais = scanner.nextLine();
                usuario.setPais(pais);

                System.out.println("Insira sua daa de aniversário: ");
                int aniversario = scanner.nextInt();
                usuario.setAniversario(aniversario);

                break;
            }else if (respostaUser == 2){
                System.out.println("Clicou 2");
                break;
            } else if (respostaUser == 3) {
                System.out.println("Clicou 3");
                break;
            }else {
                break;
            }


        }
    }
}
