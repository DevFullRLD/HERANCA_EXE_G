package Utilities;

import javax.swing.*;

public class ContaPoupanca extends Conta{

    private String banco="";
    public ContaPoupanca(int numero, String titular, String tipo, double saldo, double valor, String banco) {
        super(numero, titular, tipo, saldo, valor);
        this.banco = banco;
    }

    public String getbanco() {
        return banco;
    }

    public void setbanco(String nome) {
        this.banco = nome;
    }

    public void deposito() {
        saldo+= valor;
    }

    public void saque() {
        if(getSaldo() == 0) {
            JOptionPane.showMessageDialog(null, "Sem saldo em conta");
        }else{
            saldo-= valor + 5.0;
        }
    }
    public void exibirPoupanca(){
        JOptionPane.showMessageDialog(null, "Nome do Titular: " + getTitular() + "\n" +
                "Banco: " + getbanco()  + "\n" +
                "Numero da Conta: " + getNumero()  + "\n" +
                "Titular da Conta: " + getTitular() + "\n" +
                "Saldo Atual: " +  String.format("%.2f", getSaldo()

        ));
    }
}
