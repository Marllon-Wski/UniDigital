package com.marlon.bancodigital.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }
}
