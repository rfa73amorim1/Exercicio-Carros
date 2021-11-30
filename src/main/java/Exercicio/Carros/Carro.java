package Exercicio.Carros;

import java.util.List;

public class Carro extends Veiculo{
    public String combustivel;

    public Carro() {
    }

    public Carro(String modelo, String marca, String combustivel) {
        super(modelo, marca);
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void imprimirDadosCarro (List<Carro> listaCarros){
        int diesel =0;
        int gasolina = 0;
        for (Carro item: listaCarros) {
            if (item.getCombustivel().equals("DIESEL")){
                diesel++;
            } else if (item.getCombustivel().equals("GASOLINA")){
                gasolina++;
            }
            System.out.println("Marca: "+ item.getMarca() + "| Modelo: "+ item.getModelo()
                    + "| Combustível: " + item.combustivel);
        }
        System.out.println("Total carros a Diesel "+ diesel);
        System.out.println("Total carros a Gasolina: "+ gasolina);
    }

}
