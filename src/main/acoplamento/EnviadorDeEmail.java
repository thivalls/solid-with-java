package main.acoplamento;

public class EnviadorDeEmail implements AcoesPosGeracao{

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}