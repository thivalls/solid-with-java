package main.acoplamento;

public class NotificaAdmin implements AcoesPosGeracao{

    public void executa(NotaFiscal nf) {
        System.out.println("enviando aviso para administradores");
    }
}