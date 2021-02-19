package main.OpenClosedAndDependancyInversion;

import main.OpenClosedAndDependancyInversion.interfaces.IEntrega;

public class EntregaTransportadora implements IEntrega {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 10;
        }
        return 100;
    }
}
