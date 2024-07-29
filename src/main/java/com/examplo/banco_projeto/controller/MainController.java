package com.exemplo.banco.controller;

import com.exemplo.banco.BancoFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/banco")
    public String banco(@RequestParam(value = "saldo", defaultValue = "1000") double saldo) {
        BancoFacade bancoFacade = new BancoFacade(saldo);

        bancoFacade.mostrarInformacoesBanco();
        bancoFacade.mostrarSaldo();
        bancoFacade.aplicarJurosSimples();
        bancoFacade.aplicarJurosCompostos();
        bancoFacade.mostrarSaldo();

        return "Operações realizadas com sucesso! Verifique o console para mais detalhes.";
    }
}
