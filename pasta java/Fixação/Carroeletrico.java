package Fixação;

public class Carroeletrico extends Veiculo {
    private String combustivel;

    public Carroeletrico(String marca, String cor, int precoBase) {
        super(marca, cor, precoBase);
        this.combustivel = "Elétrico";
    }

    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public void ligarMotor() {
        System.out.println("*Silêncio*");
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Combustível: "+ combustivel);
    }
}
