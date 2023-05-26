package com.example.persistence.models;

import lombok.ToString;

@ToString
public class Corrente extends Conta {
    public Corrente(Cliente cliente) {
     super(cliente);
    }

    @Override
    public void mostrarConta() {
        System.out.println("Conta" + super.numeroConta + " - Tipo: Conta Corrente ");
        super.mostrarConta();
    }
   


}
