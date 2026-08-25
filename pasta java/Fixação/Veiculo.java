package Fixação;

public class Veiculo {
    private String marca;
    private String cor;
    private double precoBase;


    public Veiculo(String marca, String cor, double precoBase) {
        this.marca = marca;
        this.cor = cor;
        this.precoBase = precoBase;
    }


    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return precoBase;
    }



    public void ligarMotor() {
        System.out.println("Vrummmm");
    }

    public void andar() {
        System.out.println("*carro andando para frente*");
    }


    public void exibirInfo() {
        System.out.println("------Informações do carro-----");
        System.out.println("Marca: "+marca);
        System.out.println("Cor do carro: "+cor);
        System.out.println("Preço: R$"+precoBase);
    }
}
