package atividade.leo.java;

import java.util.Date;

public class Questão1{

    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    
    public Questão1(String nomeTitular, int numero, String agencia, double saldo, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public double calcularRendimento() {
        
        
        double taxaDeRendimento = 0.05; 
        return saldo * taxaDeRendimento;
    }

    

    public static void main(String[] args) {
        
        Questão1 minhaConta = new Questão1("John Doe", 123456, "001", 1000.0, "01/01/2023");

        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);

        double rendimento = minhaConta.calcularRendimento();
        System.out.println("Rendimento mensal: R$" + rendimento);
    }
}
