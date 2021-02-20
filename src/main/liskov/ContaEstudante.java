package main.liskov;

public class ContaEstudante extends ContaComum {

    private int milhas;
    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaEstudante() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    public double getSaldo() {
        return this.manipuladorDeSaldo.getSaldo();
    }
}
