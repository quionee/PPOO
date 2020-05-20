import java.util.*;

public class Empresa {
    
    private String nome;
    private String cnpj;
    ArrayList<Funcionario> funcionarios;
    
    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        funcionarios = new ArrayList<>();
    }
    
    public void admitirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void gerarRelatorioDePrioridade() {
        Collections.sort(funcionarios);
        
        for (Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
    
}
