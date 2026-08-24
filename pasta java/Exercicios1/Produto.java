package Exercicios1;
public class Produto {
    String nome;
    double preco;
    int estoque;

    void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * (porcentagem / 100));
    }
}
