package main;

import main.liskov.ContaComum;
import main.liskov.ContaEstudante;

import java.util.Arrays;
import java.util.List;

public class MainClassLiskov {
    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
    }

    private static ContaEstudante contaDeEstudanteCom(double amount) {
        ContaEstudante c = new ContaEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
}
