package carrinhoteste;

import java.util.Scanner;

public class CarrinhoTeste {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("Luiz", 24, 6, 2017);
        Scanner le = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            carrinho.inserirItem(le.next());
        }
        carrinho.exibir();
        
        Carrinho carrinho1 = new Carrinho("Luiz", 24, 6, 2017, 3);
        for (int i = 0; i < 3; ++i) {
            carrinho1.inserirItem(le.next());
        }
        carrinho1.exibir();
    }
    
}
