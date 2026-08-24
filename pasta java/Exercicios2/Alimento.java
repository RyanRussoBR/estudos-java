package Exercicios2;


public class Alimento extends Produto {
    private int calorias;

    public Alimento(String nome, double preco, int estoque, int calorias) {
        super(nome, preco, estoque);
        this.calorias = calorias;
    }



    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Calorias: "+calorias+"kcal");
        System.out.println("----------------------------------");
    }
    public int getCalorias() {
        return calorias;
    }
}
