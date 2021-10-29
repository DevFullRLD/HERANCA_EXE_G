package Utilities;

import javax.swing.*;

public class ContaInvestimento extends Conta{
    private String nomeInvestimento="";

    public ContaInvestimento(int numero, String titular, String tipo, double saldo, double valor, String nomeInvestimento) {
        super(numero, titular, tipo, saldo, valor);
        this.nomeInvestimento = nomeInvestimento;
    }

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public void setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
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
    public void exibirInvestimento(){
        JOptionPane.showMessageDialog(null, "Nome do Invesimento: " + getNomeInvestimento() + "\n" +
                "Numero da Conta: " + getNumero()  + "\n" +
                "Titular da Conta: " + getTitular() + "\n" +
                "Saldo Atual: " +  String.format("%.2f", getSaldo()

        ));
    }
}
