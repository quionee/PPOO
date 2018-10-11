package provateste;

public class Correcao {
    private int idQuestao;
    private String situacao;
    private int qtdTentativas;
    
    public Correcao(int idQuestao, String situacao, int qtdTentativas) {
        this.idQuestao = idQuestao;
        this.situacao = situacao;
        this.qtdTentativas = qtdTentativas;
    }
    
    public int getIdQuestao() {
        return idQuestao;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public int getQtdTentativas() {
        return qtdTentativas;
    }
    
}
