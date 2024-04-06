import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Jogo jogo = new Jogo();

        while(true) {
            System.out.println("Bem vindo a Steam!");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Adicionar Review");
            System.out.println("3 - Visualizar jogos");
            System.out.println("0 - Sair ");

            System.out.println("Escolha uma das opções: ");
            int respostaUser = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (respostaUser) {
                case 1:
                    cadastrarUsuario(scanner, usuario);
                    break;
                case 2:
                    adicionarReview(scanner, jogo);
                    break;
                case 3:
                    visualizarJogos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return; // Termina a execução do programa
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    public static void cadastrarUsuario(Scanner scanner, Usuario usuario) {
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

        System.out.println("Insira sua data de aniversário: ");
        int aniversario = scanner.nextInt();
        usuario.setAniversario(aniversario);

        usuario.adicionarUsuario(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void adicionarReview(Scanner scanner, Jogo jogo) {
        System.out.println("Digite o nome do jogo para adicionar uma revisão:");
        String nomeJogo = scanner.nextLine();

        if (jogo.getNome().equals(nomeJogo)) {
            System.out.println("Digite sua review para o jogo '" + nomeJogo + "':");
            String comentario = scanner.nextLine();
            jogo.adicionarReview(comentario);
            System.out.println("Review adicionada com sucesso para o jogo '" + nomeJogo + "'.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    public static void visualizarJogos() {
        Jogo jogo = new Jogo();
        jogo.imprimirJogos();
    }
}

