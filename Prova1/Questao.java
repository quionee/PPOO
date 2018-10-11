package provateste;

import java.util.Random;

public class Questao {
    private int num1;
    private int num2;
    private String enunciado;
    private int gabarito;
    private static int qtdQuestoes = 0;
    private int idQuestao;
    
    public Questao() {
        Random numeroAleatorio = new Random();
        num1 = numeroAleatorio.nextInt(10);
        num2 = numeroAleatorio.nextInt(10);
        enunciado = ("Quanto e " + num1 + " * " + num2 + "? ");
        gabarito = num1 * num2;
        ++qtdQuestoes;
        idQuestao = qtdQuestoes;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
    
    private int getGabarito() {
        return gabarito;
    }
    
    public int getIdQuestao() {
        return idQuestao;
    }
    
    public int getQtdQuestoes() {
        return qtdQuestoes;
    }
    
    public boolean verificaSeRespostaCerta(int resposta) {
        return (resposta == gabarito);
    }
    
}
