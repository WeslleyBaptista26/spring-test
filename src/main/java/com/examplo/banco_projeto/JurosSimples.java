package com.exemplo.banco;

public class JurosSimples implements EstrategiaCalculoJuros {
    public double calcular(double saldo) {
        return saldo * 0.05; // 5% de juros simples
    }
}
