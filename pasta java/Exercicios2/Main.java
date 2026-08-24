package Exercicios2;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("SinkMaster", 110);
        Produto p2 = new Produto("Chuveiro", 50, 15);
        Eletronico e1 = new Eletronico("Computador", 8500, 3, 872);
        Alimento a1 = new Alimento("Banana", 10, 5, 50);

        e1.exibirFicha();
        e1.aumentarEstoque(5);
        a1.exibirFicha();

        p1.exibirFicha();
        p1.aplicarDesconto(10);
        p1.aumentarEstoque(3);

        e1.exibirFicha();
        p1.exibirFicha();
        p2.exibirFicha();
    }
}
