package main.acoplamento;

public class NotaFiscalDao implements AcoesPosGeracao{

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}