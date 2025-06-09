package com.marlon.bancodigital;

import com.marlon.bancodigital.model.Cliente;
import com.marlon.bancodigital.model.ContaCorrente;
import com.marlon.bancodigital.service.ClienteService;

public class BancoDigitalApp {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        Cliente cliente = clienteService.cadastrarCliente("Marlon", "123456789");
        cliente.adicionarConta(new ContaCorrente(1000));
        System.out.println("Cliente cadastrado: " + cliente.getNome());
    }
}
