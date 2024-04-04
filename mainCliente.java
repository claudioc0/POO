import java.util.Scanner;

public class mainCliente {
    public static void mainCliente(String[] args){
            Scanner scanner = new Scanner(System.in);

            // USUÁRIO
            Usuario usuario = new Usuario();
            usuario.setNickname("marcelo500");
            System.out.println(usuario.getNome() + " seu novo nickname é " + usuario.getNickname());

            // TESTE
            System.out.println("Sua senha é " + usuario.getSenha() + ". Deseja trocar de senha? ");
            String resposta = scanner.nextLine();
            if (resposta.equals("s")){
                System.out.println("Digite sua nova senha: ");
                String novaSenha = scanner.nextLine();
                usuario.setSenha(novaSenha);
                System.out.println("Sua nova senha é " + usuario.getSenha());
            } else if (resposta.equals("n")) {
                System.out.println("Sua senha continua a mesma");
            }

            //JOGO
            Jogo jogo = new Jogo();
            System.out.println("Deixe sua review sobre o jogo " + jogo.getNome() + " ?");
            String reviewUsuario = scanner.nextLine();
            jogo.setReview(reviewUsuario);

            //COMUNIDADE
            Comunidade comunidade = new Comunidade();


            System.out.println(comunidade.getNomeJogo());
            System.out.println(comunidade.getSobreComunidade());
            System.out.println(comunidade.getNoticiasComunidade());

            System.out.println("fórum");

            System.out.println("Faça um post no forum");
            String mensagensforum = scanner.nextLine();
            comunidade.setMensagensForum(mensagensforum);
            System.out.println(comunidade.getMensagensForum());


            //Suporte
            Suporte suporte = new Suporte();

            System.out.println(suporte.getProblema());
            suporte.setProblema("quero solicitar um reembolso ");



            //estatistica

            Estatistica stats = new Estatistica();

            System.out.println(stats.getNomeJogo());
            System.out.println(stats.getData());
            System.out.println(stats.getJogadoresOnline());
            System.out.println(stats.getNumeroVendas());

        }
    }

