package Exercicios1;
public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.nome = "Travesseiro Cervical";
        prod1.preco = 150;
        prod1.estoque = 15;

        System.out.println("Preço original: " + prod1.preco);

        prod1.aplicarDesconto(20);

        System.out.println("Novo preço: R$" + prod1.preco);
    }
}
