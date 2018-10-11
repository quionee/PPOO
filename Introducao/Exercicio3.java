import java.util.Scanner;

public class Exercicio3 {
    public static void main (String args[]) {
        Scanner le = new Scanner(System.in);
        int[] notas = new int[9];
        for (int i = 0; i < 9; ++i) {
            notas[i] = le.nextInt();
        }
        int qtdMaior = 0, moda = -1, numero = -1;
        for (int i = 0; i < 9; ++i) {
            int qtd = 0;
            for (int j = i + 1; j < 9; ++j) {
                if (notas[i] == notas[j]) {
                    ++qtd;
                    numero = notas[i];
                }
            }
            if (qtd > qtdMaior) {
                moda = numero;
            }
        }
        if (moda != -1) {
            System.out.println(numero);
        }
    }
}
