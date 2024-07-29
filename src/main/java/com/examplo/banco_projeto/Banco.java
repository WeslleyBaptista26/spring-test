package com.exemplo.banco;

public class Banco {
    private static Banco instancia;

    private Banco() {
        // Construtor privado para evitar instância externa
    }

    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void mostrarInformacoesBanco() {
        System.out.println("Banco XYZ");
    }
}
