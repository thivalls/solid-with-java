package main.OpenClosedAndDependancyInversion;

import main.OpenClosedAndDependancyInversion.interfaces.ICalculo;

public class TabelaEspecial implements ICalculo {

    @Override
    public double descontoPara(double valor) {
        if(valor>=10000) return 0.5;
        return 0.3;
    }
}
