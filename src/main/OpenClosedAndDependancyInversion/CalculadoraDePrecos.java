package main.OpenClosedAndDependancyInversion;

import main.OpenClosedAndDependancyInversion.interfaces.ICalculo;
import main.OpenClosedAndDependancyInversion.interfaces.IEntrega;

public class CalculadoraDePrecos {

    private ICalculo tabela;
    private IEntrega entrega;

    public CalculadoraDePrecos(ICalculo tabela, IEntrega entrega) {
        this.tabela = tabela;
        this.entrega = entrega;
    }

    public double calcula(Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        System.out.println(produto.getValor() * (1-desconto) + frete);
        return produto.getValor() * (1-desconto) + frete;
    }
}
