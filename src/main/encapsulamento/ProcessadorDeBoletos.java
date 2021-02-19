package main.encapsulamento;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);

            // Lei de Demeter sendo destruída
            // fatura.getPagamentos().add(pagamento);

            // Corrigindo lei de Demeter
            // Encapsulando código
            fatura.processarPagamento(pagamento);
            total += boleto.getValor();
        }

        System.out.println(total);
        System.out.println(fatura.isPago());
    }
}
