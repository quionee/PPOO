package testediabetes;

public class Paciente {
    
    String nome;
    double[] exames;
    int exameAtual;
    
    public Paciente(String nome, int qtdExames) {
        this.nome = nome;
        this.exames = new double[qtdExames];
        exameAtual = 0;
    }
    
    public String getNomePaciente() {
        return nome;
    }
    
    public double getResultadoAmostra(int numeroAmostra) {
        return exames[numeroAmostra - 1];
    }
    
    public double getResultadoMedio() {
        double somaResultados = 0;
        for (int i = 0; i < exames.length; ++i) {
            somaResultados += exames[i];
        }
        return (somaResultados / exames.length);
    }
    
    public String getDiagnostico() {
        double resultado = getResultadoMedio();
        if (resultado < 140) {
            return "Glicemia normal";
        }
        if (resultado < 200) {
            return "Risco de diabetes";
        }
        return "Diabetes Mellitus";
    }
    
    public void setResultadoAmostra(double resultadoAnalise) {
        exames[exameAtual] = resultadoAnalise;
        ++exameAtual;
    }
    
}
