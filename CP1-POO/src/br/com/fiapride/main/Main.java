package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculos v1 = new Veiculos("Carlos", "ABC-1234", 0);
        v1.setCombustivel(-10);
        v1.abastecer(50);
        v1.andar(100);
        System.out.println("Dono: " + v1.getNomeDono() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getCombustivel());
    }
}
