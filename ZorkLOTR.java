import java.util.Scanner; // Classe Scanner para entrada do usuário

// Classe principal do jogo, inspirado nos três primeiros capítulos de "O Senhor do Anéis"
public class ZorkLOTR {
    public static void main(String[] args) {
        // Tipo primitivo boolean: controla o loop do jogo
        boolean jogoAtivo = true;
        
        // Classe Scanner: objeto para ler escolhas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Tipo primitivo int: armazena a escolha do usuário
        int escolha;
        
        // Apresentação inicial com citação do livro
        System.out.println("*** Bem-vindo a 'A Jornada de Frodo' ***");
        System.out.println("Você é Frodo Bolseiro, um hobbit do Condado, vivendo dias de paz em Bolsão.");
        System.out.println("\"Um hobbit de aparência extremamente jovem, com olhos brilhantes e cabelo castanho encaracolado.\"");
        System.out.println("A história começa com a festa de aniversário de Bilbo, seu tio, que está completando 111 anos.\n");

        while (jogoAtivo) {
            // Cena 1: A Festa de Aniversário de Bilbo (Capítulo 1: Uma Festa Muito Esperada)
            System.out.println("\n=== A Festa de Aniversário ===");
            System.out.println("O Condado está em festa para celebrar os 111 anos de Bilbo e seus 33 anos, Frodo.");
            System.out.println("Bilbo faz um discurso e, para surpresa de todos, desaparece usando um anel mágico!");
            System.out.println("\"Eu não me encaixo mais aqui, não é mesmo?\", diz Bilbo antes de sumir.");
            System.out.println("Você, Frodo, herda Bolsão e um misterioso anel. O que você faz?");
            System.out.println("1. Guardar o anel em segredo e continuar vivendo em Bolsão.");
            System.out.println("2. Mostrar o anel para seus amigos hobbits, como Merry e Pippin.");
            System.out.println("3. Procurar Gandalf imediatamente para perguntar sobre o anel.");
            System.out.print("Escolha (1-3): ");
            
            // Leitura da escolha com tratamento de erro
            try {
                escolha = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um número válido (1-3)!");
                scanner.nextLine(); // Limpa o buffer
                continue;
            }
            
            switch (escolha) {
                case 1:
                    // Escolha: Guardar o anel
                    System.out.println("\nVocê guarda o anel em um envelope e tenta viver normalmente.");
                    System.out.println("Meses se passam, mas você sente um peso crescente. Algo parece errado.");
                    // Passa para a próxima cena
                    cenaGandalf(scanner);
                    break;
                case 2:
                    // Escolha: Mostrar o anel aos amigos
                    System.out.println("\nVocê mostra o anel a Merry e Pippin. Eles ficam fascinados, mas espalham a notícia.");
                    System.out.println("Logo, rumores chegam a ouvidos perigosos. Cavaleiros Negros aparecem no Condado!");
                    System.out.println("*** Fim de Jogo: Os Nazgûl encontram você! ***");
                    jogoAtivo = false;
                    break;
                case 3:
                    // Escolha: Procurar Gandalf
                    System.out.println("\nVocê procura Gandalf, sentindo que o anel é mais importante do que parece.");
                    // Passa para a próxima cena
                    cenaGandalf(scanner);
                    break;
                default:
                    System.out.println("Erro: Escolha inválida! Digite 1, 2 ou 3.");
                    continue;
            }
        }
        
        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
    
    // Método para a Cena 2: A Sombra do Passado
    private static void cenaGandalf(Scanner scanner) {
        // Tipo primitivo boolean: controla o loop da cena
        boolean cenaAtiva = true;
        
        System.out.println("\n=== A Sombra do Passado ===");
        System.out.println("Gandalf, o Cinzento, chega a Bolsão e revela a verdade sobre o anel.");
        System.out.println("\"Este é o Anel Mestre, forjado por Sauron\", diz Gandalf, com olhos graves.");
        System.out.println("Ele explica que o anel deve ser destruído, mas o Condado não é mais seguro.");
        System.out.println("O que você faz, Frodo?");
        System.out.println("1. Decidir partir do Condado para levar o anel a Valfenda.");
        System.out.println("2. Tentar esconder o anel no Condado e esperar que Sauron não o encontre.");
        System.out.println("3. Dar o anel a Gandalf para que ele cuide do problema.");
        System.out.print("Escolha (1-3): ");
        
        while (cenaAtiva) {
            // Tipo primitivo int: armazena a escolha
            int escolha;
            try {
                escolha = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um número válido (1-3)!");
                scanner.nextLine();
                continue;
            }
            
            switch (escolha) {
                case 1:
                    // Escolha: Partir para Valfenda
                    System.out.println("\nVocê decide partir com o anel, acompanhado por Sam, seu fiel amigo.");
                    cenaPartida(scanner);
                    cenaAtiva = false;
                    break;
                case 2:
                    // Escolha: Esconder o anel
                    System.out.println("\nVocê tenta esconder o anel, mas os Cavaleiros Negros sentem sua presença.");
                    System.out.println("*** Fim de Jogo: Os Nazgûl capturam você! ***");
                    cenaAtiva = false;
                    return;
                case 3:
                    // Escolha: Dar o anel a Gandalf
                    System.out.println("\nGandalf recusa o anel, dizendo: \"Não me tente! Não ouso tomá-lo.\"");
                    System.out.println("Ele insiste que você deve levá-lo a Valfenda.");
                    cenaPartida(scanner);
                    cenaAtiva = false;
                    break;
                default:
                    System.out.println("Erro: Escolha inválida! Digite 1, 2 ou 3.");
            }
        }
    }
    
    // Método para a Cena 3: Três não é Demais
    private static void cenaPartida(Scanner scanner) {
        System.out.println("\n=== Três não é Demais ===");
        System.out.println("Você, Sam e Pippin partem do Condado, atravessando campos e florestas.");
        System.out.println("\"Não se pode confiar em um hobbit quando se trata de aventuras\", diz Pippin, rindo.");
        System.out.println("Você avista figuras escuras ao longe. Podem ser os Cavaleiros Negros!");
        System.out.println("O que você faz?");
        System.out.println("1. Esconder-se nos arbustos e esperar.");
        System.out.println("2. Correr para a Floresta Velha, mesmo sendo perigosa.");
        System.out.println("3. Continuar na estrada, enfrentando quem vier.");
        System.out.print("Escolha (1-3): ");
        
        // Tipo primitivo int: armazena a escolha
        int escolha;
        try {
            escolha = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite um número válido (1-3)!");
            scanner.nextLine();
            return;
        }
        
        switch (escolha) {
            case 1:
                // Escolha: Esconder-se
                System.out.println("\nVocê se esconde nos arbustos. Os Cavaleiros passam sem notá-lo.");
                System.out.println("Você continua sua jornada para Valfenda, com Sam e Pippin ao seu lado.");
                System.out.println("*** Fim: Você sobrevive e segue para a próxima aventura! ***");
                break;
            case 2:
                // Escolha: Floresta Velha
                System.out.println("\nVocê entra na Floresta Velha, mas as árvores parecem vivas e hostis.");
                System.out.println("Vocês se perdem e são capturados por um salgueiro maligno!");
                System.out.println("*** Fim de Jogo: Preso na Floresta Velha! ***");
                break;
            case 3:
                // Escolha: Enfrentar na estrada
                System.out.println("\nVocê enfrenta a estrada, mas os Cavaleiros Negros são rápidos e implacáveis.");
                System.out.println("*** Fim de Jogo: Capturado pelos Nazgûl! ***");
                break;
            default:
                System.out.println("Erro: Escolha inválida! Digite 1, 2 ou 3.");
        }
    }
}
```
