package com.example.persistence.models;

public class Poupanca extends Conta {

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void mostrarConta() {
        System.out.println("Conta" + super.numeroConta + " - Tipo: Conta Poupança ");
        super.mostrarConta();
    }
   
    
    
}
