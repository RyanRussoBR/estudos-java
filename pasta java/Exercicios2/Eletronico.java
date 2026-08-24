package Exercicios2;

public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preco, int estoque, int voltagem) {
        super(nome, preco, estoque);
        if (voltagem == 110 || voltagem == 220) {
            this.voltagem = voltagem;
        } else {
            System.out.println("Voltagem inválida. Colocando voltagem como 110V (padrão).");
            this.voltagem = 110;
        }
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Voltagem da máquina: "+voltagem+"V");
        System.out.println("----------------------------------");
    }


    public int getVolts() {
        return voltagem;
    }
}
