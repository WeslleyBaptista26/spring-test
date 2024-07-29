package com.exemplo.banco;

public class Conta {
    private double saldo;
    private EstrategiaCalculoJuros estrategia;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void setEstrategia(EstrategiaCalculoJuros estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularJuros() {
        return estrategia.calcular(saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
