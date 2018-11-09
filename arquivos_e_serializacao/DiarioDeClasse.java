import java.util.*;
import java.io.*;

public class DiarioDeClasse implements Serializable {
    
    private String turma;
    private String disciplina;
    private ArrayList<Aluno> alunos;
    
    public DiarioDeClasse(String turma, String disciplina) {
        this.turma = turma;
        this.disciplina = disciplina;
        alunos = new ArrayList<Aluno>();
    }
    
    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void gerarRelatorio() {
        if (!alunos.isEmpty()) {
            System.out.println("Matricula    Nome    Nota    Situacao");
            for (Aluno aluno : alunos) {
                System.out.printf("%8d%9s%8s%13s", aluno.getMatricula(), aluno.getNome(), aluno.getNota(), aluno.situacao());
                System.out.println();
            }
        }
        else {
            System.out.println("Diario vazio!");
        }
    }
    
    public void gravarRelatorioTexto(String nomeArquivo) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            
            Collections.sort(alunos);
            
            for (Aluno aluno : alunos) {
                arquivo.write(aluno.getMatricula() + ", " + aluno.getNome() + ", " + aluno.getNota() + ", " + aluno.situacao() + "\n");
            }
            
            arquivo.close();
        }
        catch (IOException e) {
            System.out.println("Problema ao salvar no arquivo " + nomeArquivo);
        }
    }
    
    public void lerDadosArquivoTexto(String nomeArquivo) {
        try {
            BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo));
            
            String linha = arquivo.readLine();
            
            while (linha != null) {
                String[] dados = linha.split(",");
                
                Aluno aluno = new Aluno(Integer.parseInt(dados[0]), dados[1], Float.parseFloat(dados[2]));
                alunos.add(aluno);
                
                linha = arquivo.readLine();
            }
            
            arquivo.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("O arquivo " + nomeArquivo + " nao foi encontrado");
        }
        catch (IOException e) {
            System.out.println("Problema ao ler do arquivo " + nomeArquivo);
        }
    }
    
}
