package Application;

import Utilities.Conta;
import Utilities.ContaInvestimento;
import Utilities.ContaPoupanca;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //ENTRADA DE DADO
        int    valida    = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero correspondente a conta desejada:" + "\n"+
                "1 - Conta poupança" + "\n" +
                "2 - Conta de Investimento"));

        switch (valida){
            case 1:{
                //VALIDAR SE VAI DEPOSITAR OU NÃO
                int op = Integer.valueOf(JOptionPane.showInputDialog(null, "Selecione a operação: " + "\n"+
                        "1 - Depósito"+"\n"+
                        "2 - Saque"));

                switch(op) {
                    case 1:{
                        //DEPOSITO
                        //ENTRADA DE DADOS
                        String banco    = JOptionPane.showInputDialog("Digite o nome do Banco");
                        int numeroC     = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o numero da conta: "));
                        double valor      = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do depósito: "));
                        String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
                        String tipo = null;
                        double sal = 0.0;
                        ContaPoupanca contaP = new ContaPoupanca(numeroC, titular, tipo, sal, valor, banco);

                        //ATRIBUINDO DADOS
                        contaP.setbanco(banco);
                        contaP.setTitular(titular);
                        contaP.setNumero(numeroC);
                        contaP.setValor(valor);
                        contaP.deposito();

                        //EXIBIR DADOS
                        contaP.exibirPoupanca();
                        break;
                    }
                    case 2:{
                        //SAQUE
                        //ENTRADA DE DADOS
                        String banco    = JOptionPane.showInputDialog("Digite o nome do Banco");
                        int numeroC     = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o numero da conta: "));
                        double valor      = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do Saque: "));
                        String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
                        String tipo = null;
                        double sal = 0.0;
                        ContaPoupanca contaP = new ContaPoupanca(numeroC, titular, tipo, sal, valor, banco);

                        //ATRIBUINDO DADOS
                        contaP.setbanco(banco);
                        contaP.setTitular(titular);
                        contaP.setNumero(numeroC);
                        contaP.setValor(valor);
                        contaP.saque();

                        //EXIBIR DADOS
                        contaP.exibirPoupanca();
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null,"Opção invalida, execute novamente");
                        break;
                    }
                }
                break;
            }
            case 2:{
                int op = Integer.valueOf(JOptionPane.showInputDialog(null, "Selecione a operação: " + "\n"+
                        "1 - Depósito"+"\n"+
                        "2 - Saque"));

                switch(op) {
                    //SAQUE
                    case 1:{
                        String nomeI    = JOptionPane.showInputDialog("Digite o nome do Investimento ");
                        double valor = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do seu deposito: "));
                        int numeroI     = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o numero da conta: "));
                        String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
                        String tipo = null;
                        double sal = 0.0;
                        ContaInvestimento contaIN = new ContaInvestimento(numeroI, titular, tipo, sal, valor, nomeI);

                        //ATRIBUINDO DADOS
                        contaIN.setNomeInvestimento(nomeI);
                        contaIN.setValor(valor);
                        contaIN.setTitular(titular);
                        contaIN.setNumero(numeroI);
                        contaIN.deposito();

                        //EXIBIR DADOS
                        contaIN.exibirInvestimento();
                        break;
                    }
                    case 2:{
                        //DEPOSITO
                        String nomeI    = JOptionPane.showInputDialog("Digite o nome do Investimento ");
                        double valor = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do seu saque: "));
                        int numeroI     = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o numero da conta: "));
                        String titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
                        String tipo = null;
                        double sal = 0.0;
                        ContaInvestimento contaIN = new ContaInvestimento(numeroI, titular, tipo, sal, valor, nomeI);

                        //ATRIBUINDO DADOS
                        contaIN.setNomeInvestimento(nomeI);
                        contaIN.setValor(valor);
                        contaIN.setTitular(titular);
                        contaIN.setNumero(numeroI);

                        //EXIBIR DADOS
                        contaIN.exibirInvestimento();
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null,"Opção invalida, execute novamente");
                        break;
                    }
                }
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida, execute novamente");
                break;
            }
        }
    }
}
