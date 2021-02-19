package main.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public boolean isPago() {
        return pago;
    }

    // TOMAR CUIDADO COM ESTE TIPO DE SETTER
    //    public void setPago(boolean pago) {
    //        this.pago = pago;
    //    }

    public void processarPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.computarPagamento();
    }

    private void computarPagamento() {
        double total = 0;
        for (Pagamento pagamento: pagamentos) {
            total += pagamento.getValor();
        }
        if(total >= this.valor) {
            this.pago = true;
        }
    }
}