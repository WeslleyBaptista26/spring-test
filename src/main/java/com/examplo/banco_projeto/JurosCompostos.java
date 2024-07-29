package com.exemplo.banco;

public class JurosCompostos implements EstrategiaCalculoJuros {
    public double calcular(double saldo) {
        return saldo * Math.pow(1.05, 12) - saldo; // 5% de juros compostos anuais
    }
}
