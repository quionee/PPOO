import java.util.Scanner;

public class Exercicio2 {
    public static void main (String args[]) {
        Scanner le = new Scanner(System.in);
        int velocidadeRubens = le.nextInt();
        int velocidadeAirton = le.nextInt();
        int numeroDaVolta = 10;
        float caminhoRubens = 15000;
        float caminhoAirton = 14880;
        float tempoVoltaRubens = 1500 / velocidadeRubens;
        float tempoVoltaAirton = 1500 / velocidadeAirton;
        int tempo1 = Math.round(tempoVoltaRubens);
        int tempo2 = Math.round(tempoVoltaRubens);
        
        while (caminhoRubens > caminhoAirton) {
            caminhoRubens += (velocidadeRubens * tempo1);
            caminhoAirton += (velocidadeAirton * tempo2);
            ++numeroDaVolta;
        }
        
        System.out.println(numeroDaVolta);
    }
}

