package br.com.fiapride.model;

public class Veiculos {

    private String nomeDono;
    private String placa;
    private double combustivel;

    public Veiculos(String nomeDono, String placa, double combustivel){
        this.nomeDono = nomeDono;
        this.placa = placa;

        if (combustivel < 0) {
            this.combustivel = 0;
        } else {
            this.combustivel = combustivel;
        }
    }

    public void abastecer(double quantidade) {
        if (quantidade <= 0) {
            System.out.printf("Coloque uma quantidade de combustível válida em litros para o abastecimento\n");
            return;
        }
        combustivel += quantidade;
        System.out.printf(quantidade + "L adicionados\n");
    }
    public void andar(double quantidade) {
        if (quantidade <= 0 || this.combustivel < quantidade){
            System.out.printf("Coloque uma quantidade de combustível gasto válida em litros\n");
            return;
        }
            combustivel -=  quantidade;
            System.out.printf(quantidade + "L gastos\n");
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel < 0){
            System.out.printf("O combustível não pode ser negativo\n");
            return;
        }
        this.combustivel = combustivel;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
