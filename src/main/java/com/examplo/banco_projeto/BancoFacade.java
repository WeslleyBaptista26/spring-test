package com.exemplo.banco;

public class BancoFacade {
    private Conta conta;
    private Banco banco;

    public BancoFacade(double saldoInicial) {
        this.banco = Banco.getInstancia();
        this.conta = new Conta(saldoInicial);
    }

    public void mostrarInformacoesBanco() {
        banco.mostrarInformacoesBanco();
    }

    public void aplicarJurosSimples() {
        conta.setEstrategia(new JurosSimples());
        System.out.println("Juros simples aplicados: " + conta.calcularJuros());
    }

    public void aplicarJurosCompostos() {
        conta.setEstrategia(new JurosCompostos());
        System.out.println("Juros compostos aplicados: " + conta.calcularJuros());
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
