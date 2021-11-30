package Exercicio.Carros;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Carro> listaCarros = new ArrayList<Carro>();
        Carro carro = new Carro();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a Marca do " + (i + 1) + "o. carro: ");
            String marca = scan.nextLine();
            System.out.println("Digite o Modelo do " + (i + 1) + "o. carro: ");
            String modelo = scan.nextLine();
            System.out.println("Digite o Combustível do " + (i + 1) + "o. carro: ");
            String combustivel= scan.nextLine().toUpperCase(Locale.ROOT);

            while (!combustivel.equals("GASOLINA") && !combustivel.equals("DIESEL")){
                System.out.println("Você deve digitar 'GASOLINA' ou 'DIESEL' para o " + (i + 1) + "o. carro: ");
                combustivel = scan.nextLine().toUpperCase(Locale.ROOT);
            }
            carro = new Carro(modelo, marca, combustivel);
            listaCarros.add(carro);
        }
        carro.imprimirDadosCarro(listaCarros);
    }
}














