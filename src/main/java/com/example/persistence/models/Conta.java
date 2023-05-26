package com.example.persistence.models;


import lombok.Getter;

@Getter
public abstract class Conta {

    private static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL ++;
        this.agencia = Conta.AGENCIA;
        this.saldo = 0d;
        this.cliente = cliente;
    }

    public Double sacar(  Double valor){
        try {
            if( this.saldo > valor) this.saldo -= valor;
            else  System.out.println("saque de "  + valor + " reais não permitido, valor insuficiente.");
        } catch (Exception e) {
            System.out.println("saque não permitido, valor insuficiente.");
            e.getMessage();
        }
        return this.saldo;
    }

    public void depositar(Double valor){
        try {
            if(valor>0)this.saldo +=valor;
            else System.out.println(" valor menor ou igual a zero não permitido");
        } catch (Exception e) {
           e.getMessage();
        }
    }

    public void transferir( Conta contaDestino, Double valor){
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void mostrarConta(){
        
        System.out.println("Titular: " + this.cliente);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("======================");
    }
   
    
}
