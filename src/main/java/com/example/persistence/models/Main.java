package com.example.persistence.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        List <Cliente> listaClientes = new ArrayList<Cliente>();

        Cliente cliente = new Cliente("Fulano", "45645645125", LocalDate.now());
        Cliente cliente1 = new Cliente("Siclano", "97897864521", LocalDate.now());
        Cliente cliente2 = new Cliente("Beltrano", "12345678910", LocalDate.now());
        Cliente cliente3 = new Cliente("Maria", "10987654321", LocalDate.now());
        Cliente cliente4 = new Cliente("Joana", "85296374173", LocalDate.now());
        
        listaClientes.add(cliente);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);

        Corrente contaCorrente = new Corrente(cliente);
        Poupanca contaPoupanca = new Poupanca(cliente1);
        Poupanca contaPoupanca2 = new Poupanca(cliente3);

       
        contaCorrente.depositar(500d);
        contaCorrente.mostrarConta();
        contaCorrente.transferir(contaPoupanca, 300d);
        contaCorrente.mostrarConta();
        contaPoupanca.mostrarConta();
        contaPoupanca.sacar(30d);
        contaPoupanca.mostrarConta();
        contaPoupanca.sacar(400d);
        contaPoupanca.mostrarConta();
        contaPoupanca.transferir(contaPoupanca2, 50d);
        contaCorrente.mostrarConta();
        contaPoupanca2.mostrarConta();

        System.out.println(listaClientes);
    }
}
