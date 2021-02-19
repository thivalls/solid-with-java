package main;

import main.encapsulamento.Boleto;
import main.encapsulamento.Fatura;
import main.encapsulamento.ProcessadorDeBoletos;

import java.util.ArrayList;
import java.util.List;

public class MainClassEncapsulamento {
    public static void main(String[] args) {
        // criando boletos
        Boleto boleto1 = new Boleto(100);
        Boleto boleto2 = new Boleto(200);

        // adicionando boletos
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(boleto1);
        boletos.add(boleto2);

        // criando fatura
        Fatura fatura = new Fatura("Thiago", 300.0);

        // iniciando processador
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.processa(boletos, fatura);
    }
}
