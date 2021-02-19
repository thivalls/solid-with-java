package main.OpenClosedAndDependancyInversion;

import main.OpenClosedAndDependancyInversion.interfaces.IEntrega;

public class EntregaCorreios implements IEntrega {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
