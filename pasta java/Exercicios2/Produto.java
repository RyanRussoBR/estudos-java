package Exercicios2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0) {
            preco = preco - (preco * (porcentagem/100));
            System.out.println("Desconto de "+ porcentagem +"% aplicado com sucesso!");
        } else {
            System.out.println("Insira um valor positivo.");
        }
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println(quantidade + " nova(s) unidades adicionadas com sucesso ao estoque.");
        } else {
            System.out.println("Insira um valor positivo.");
        }
    }
    
    public void exibirFicha() {
        System.out.println("------Informações do Produto------");
        System.out.println("Nome do produto: "+ nome);
        System.out.println("Preço: R$"+ preco);
        System.out.println("Estoque: "+ estoque);
        System.out.println("----------------------------------");
    }
}
