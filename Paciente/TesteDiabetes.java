package testediabetes;

import java.util.Scanner;

public class TesteDiabetes {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = le.nextLine();
        System.out.print("Entre com a quantidade de amostras coletadas: ");
        int qtdAmostras = le.nextInt();
       
        Paciente paciente = new Paciente(nomePaciente, qtdAmostras);
        
        for (int i = 0; i < qtdAmostras; ++i) {
            System.out.print("Insira o resultado do teste " + (i + 1) + ": ");
            paciente.setResultadoAmostra(le.nextDouble());
        }
        
        System.out.println("############### RELATORIO FINAL ###############");
        System.out.printf("Resultado medio = %.6f%n", paciente.getResultadoMedio());
        System.out.println("Diagnostico: " + paciente.getDiagnostico());
    
    }
    
}
