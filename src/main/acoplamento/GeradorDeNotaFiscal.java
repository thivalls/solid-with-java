package main.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

    private final List<AcoesPosGeracao> acoes;

    public GeradorDeNotaFiscal(List<AcoesPosGeracao> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (AcoesPosGeracao acao: acoes) {
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}