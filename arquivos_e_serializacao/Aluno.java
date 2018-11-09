import java.io.*;

public class Aluno implements Comparable<Aluno>, Serializable {
    
    private int matricula;
    private String nome;
    private float nota;
    
    public Aluno(int matricula, String nome, float nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }
    
    public String situacao() {
        if (nota < 60) {
            return "Reprovado";
        }
        else {
            return "Aprovado";
        }
    }
    
    @Override
    public int compareTo(Aluno aluno) {
        if (nota > aluno.nota) {
            return 1;
        }
        else if (nota < aluno.nota) {
            return -1;
        }
        return 0;
    }
    
}
