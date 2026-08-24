package Exercicios1;
// import java.util.ArrayList;
import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual marca? ");
        String marca = scanner.nextLine();

        
        System.out.println("Qual cor? ");
        String cor = scanner.nextLine();

        System.out.println("Qual ano? ");
        int novoAno = scanner.nextInt();
        
        Carro meuCarro = new Carro(marca, cor, novoAno);

        meuCarro.inserirAno(novoAno);

        if (meuCarro.inserirAno(novoAno)) {
            System.out.println("O carro que criei é um(a) " + meuCarro.getMarca() + " Do ano de " + meuCarro.getAno() + " Tendo sua cor: " + meuCarro.getCor());
            meuCarro.roncarMotor();
        }


        scanner.close();

    // Dominando a sintaxe básica (no caso a lista huehue) do Java 
        // ArrayList<String> jogos = new ArrayList<>();
        // jogos.add("Gta V");
        // jogos.add("Minecraft");
        // jogos.add("League of Legends");
        // jogos.add("Tomb Raider");

        // // // Teste do If
        // // jogos.remove("Minecraft");

        // if (jogos.contains("Minecraft")) {
        //     System.out.println("Tem minecraft !!!!!!!!!!!!!");
        // }

        // // Jeito feio
        // // System.out.println(jogos.get(1));
        // // System.out.println(jogos.get(2));

        // // Jeito Legalzão
        // for (int i = 0; i < jogos.size(); i++) {
        //     System.out.println("Jogo " + i + ": " + jogos.get(i));
        // }
        // System.out.println(jogos.size());
    }
}
