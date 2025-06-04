package com.marlon.bancodigital.service;

import com.marlon.bancodigital.model.Cliente;
import com.marlon.bancodigital.repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository clienteRepository = new ClienteRepository();

    public Cliente cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clienteRepository.salvar(cliente);
        return cliente;
    }
}
