package main;

import java.util.Calendar;

public class MainClass {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(1);
        funcionario.setNome("Thiago");
        funcionario.setCargo(Cargo.DESENVOLVEDOR);
        funcionario.setSalarioBase(7000.0);
        funcionario.setDataDeAdmissao(Calendar.getInstance());

        Double resultado = new CalculadoraDeSalario().calcula(funcionario);
        System.out.println(resultado);
    }
}
