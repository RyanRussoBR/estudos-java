package Exercicios2;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("SinkMaster", 110);
        Produto p2 = new Produto("Chuveiro", 50, 15);

        p1.exibirFicha();
        p1.aplicarDesconto(10);
        p1.aumentarEstoque(3);

        p1.exibirFicha();
        p2.exibirFicha();
    }
}
