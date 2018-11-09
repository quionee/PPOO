import java.util.*;

public class TesteTurma {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        
        DiarioDeClasse diario = new DiarioDeClasse("10A", "GCC178");

        int opcao;
        
        do {
            exibirMenu();
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a matricula: ");
                    int matricula = le.nextInt();
                    System.out.print("Digite o nome: ");
                    String nome = le.next();
                    System.out.print("Digite a nota: ");
                    float nota = le.nextFloat();
                    Aluno aluno = new Aluno(matricula, nome, nota);
                    diario.inserirAluno(aluno);
                    break;
                case 2:
                    try {
                        diario.gerarRelatorio();
                    }
                    catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do arquivo: ");
                    String nomeArquivo = le.next();
                    diario.gravarRelatorioTexto(nomeArquivo);
                    break;
                case 4:
                    System.out.print("Digite o nome do arquivo: ");
                    String nomeArq = le.next();
                    diario.lerDadosArquivoTexto(nomeArq);
                    break;
                case 5:
                    System.out.print("Digite o nome do arquivo: ");
                    String nomeA = le.next();
                    ManipuladorArquivoBinario.gravaArquivoBinario(diario, nomeA);
                    break;
                case 6:
                    System.out.print("Digite o nome do arquivo: ");
                    String arquivoNome = le.next();
                    diario = ManipuladorArquivoBinario.leArquivoBinario(arquivoNome);
                    break;
                case 7:
                    opcao = 7;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 7);
    }
    
    private static void exibirMenu() {
        System.out.println("");
        System.out.println("1 - Inserir aluno");
        System.out.println("2 - Gerar relatorio na tela");
        System.out.println("3 - Gravar relatorio dos dados dos alunos em arquivo de texto");
        System.out.println("4 - Ler dados dos alunos de arquivo de texto");
        System.out.println("5 - Salvar em arquivo binario");
        System.out.println("6 - Ler de arquivo binario");
        System.out.println("7 - Sair");
        System.out.print("\nDigite sua opcao: ");
    }
    
}
