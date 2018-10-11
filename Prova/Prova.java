package provateste;

import java.util.Scanner;

public class Prova {
    private Questao [] questao;
    
    public Prova() {
        questao = new Questao[5];
        for (int i = 0; i < 5; ++i) {
            questao[i] = new Questao();
        }
    }
    
    public void aplicar() {
        for (int i = 0; i < 5; ++i) {
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
            }
            else {
                System.out.println("Voce tentou " + qtdTentativas + " vez(es) e errou a questao.\n");
            }
        }
    }
    
}
