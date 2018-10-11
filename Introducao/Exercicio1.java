package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int consumoMensal = le.nextInt();
        
        double taxaFixa = 0, quantidadeConsumida = 0;
        if (consumoMensal <= 10) {
            taxaFixa = 0;
            quantidadeConsumida = 5;
        }
        else if (consumoMensal <= 100) {
            taxaFixa = 2;
            quantidadeConsumida = consumoMensal * 0.60; 
        }
        else {
            taxaFixa = 3;
            quantidadeConsumida += (0.60 * 100);
            consumoMensal -= 100;
            if (consumoMensal <= 50) {
                quantidadeConsumida += (0.85 * consumoMensal);
            }
            else {
                quantidadeConsumida += (0.85 * 50);
                consumoMensal -= 50;
                quantidadeConsumida += (1.2 * consumoMensal);
            }
        }
        double consumoTotal = quantidadeConsumida + taxaFixa;
        System.out.println(consumoTotal);
    }
}
