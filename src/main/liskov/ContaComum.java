package main.liskov;

public class ContaComum {

    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaComum() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
    }

    public void saca(double valor) {
        this.manipuladorDeSaldo.saca(valor);
    }

    public double getSaldo() {
        return this.manipuladorDeSaldo.getSaldo();
    }

    public void rende() {
        this.manipuladorDeSaldo.rende(1.1);
    }
}
