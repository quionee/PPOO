package testeempresa;

import java.util.*;

public class Empresa {
    
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        funcionarios = new ArrayList();
    }
    
    public void admitirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void gerarFolhaDePagamento() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println("Salario = R$ " + f.calcularSalario() + "\n");
        }
    }
    
}
