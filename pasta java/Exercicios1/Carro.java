package Exercicios1;
public class Carro {
    private String marca;
    private String cor;
    private int ano;

    public Carro (String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return this.marca;
    }
     public int getAno() {
        return this.ano;
    }
     public String getCor() {
        return this.cor;
    }


    public boolean inserirAno(int novoAno) {
        if (novoAno > 1886 && novoAno < 2026) {
            this.ano = novoAno;
            return true;
        } else {
            System.out.println("Ta maluco filhão, vai bagunçar outro site queridão");
            return false;
        }
    }

    public void roncarMotor() {
        System.out.println("Vruuuummmmm *barulhão do lendario v8*");
    }

}
