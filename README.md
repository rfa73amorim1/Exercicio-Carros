# Exercício-carros

Implemente um programa que deverá informar quantos carros são movidos agasolina e quantos carros são movidos a diesel de 5 carros informados pelo usuário. 

O usuário deverá informar o modelo (exemplos: Uno, Sandero, Renegade, etc), marca (exemplos: Fiat, Renault, Jeep) e tipo de combustível (exemplos: gasolina, diesel) do carro.
IMPORTANTE É obrigatório criar/utilizar uma classe que herde a classe Carro para representar um carro em seu programa. Você deverá implementar nessa classe todas as características/métodos que não estiverem presentes na classe
base Carro. 

A classe também deverá possuir um método que exiba todos os dados do carro.
Implementação da classe base Carro

public class Carro
{
public Carro()
{
this.Modelo = "";
this.Marca = 0;
}
public Carro(String modelo, String marca)
{
this.Modelo = modelo;
this.Marca = marca;
}
public String Modelo { get; set; }
public String Marca { get; set; }
}



#### Execução: linkedin.com/in/rogério-fidélis-amorim-72a9621b3

#### Nov/2021