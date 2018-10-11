package provateste;

import java.util.Scanner;

public class Prova {
    private Questao [] questao;
    private Correcao [] correcao;
    
    public Prova() {
        questao = new Questao[5];
        correcao = new Correcao[5];
        for (int i = 0; i < 5; ++i) {
            questao[i] = new Questao();
        }
    }
    
    public void aplicar() {
        for (int i = 0; i < 5; ++i) {
            String situacao;
            System.out.print("Questao " + questao[i].getIdQuestao() + "\n" + questao[i].getEnunciado());
            
            Scanner le = new Scanner(System.in);
            int respostaDoAluno = le.nextInt();

            int qtdTentativas = 1;
            boolean acertou = false;
            if (questao[i].verificaSeRespostaCerta(respostaDoAluno)) {
                System.out.println("Muito bem, voce acertou!");
                acertou = true;
            }
            else {
                System.out.println("Infelizmente voce errou!");
                System.out.print("Voce ganhou mais uma chance! Digite outra resposta para a questao: ");
                ++qtdTentativas;
                respostaDoAluno = le.nextInt();
                if (questao[i].verificaSeRespostaCerta(respostaDoAluno)) {
                    acertou = true;
                }
            }
            if (acertou) {
                System.out.println("Voce tentou " + qtdTentativas + " vez(es) e acertou a questao.\n");
                situacao = "acertou";
            }
            else {
                System.out.println("Voce tentou " + qtdTentativas + " vez(es) e errou a questao.\n");
                situacao = "errou";
            }
            
            correcao[i] = new Correcao(questao[i].getIdQuestao(), situacao, qtdTentativas); 
        }
    }
    
    public void gerarRelatorio() {
        System.out.println("Questao   " + "Situacao   " + "Numero de Tentativas");
        for (int i = 0; i < 5; ++i) {
            System.out.printf("%4d%13s%13d%n", correcao[i].getIdQuestao(), correcao[i].getSituacao(), correcao[i].getQtdTentativas());
        }  
    }
    
}
