package br.senai.novatech.aulaabstracao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * digite a opcao
		 * 1-conta corrente
		 * 2-conta poupanca
		 * 3-conta rural
		 * 
		 * digite a opcao
		 * 1-depositar
		 * 2-sacar
		 * 3-verificar saldo
		 * 
		 * deseja realizar outra operacao 
		 * digite 1- sim 2-nao
		 * 
		 * 
		 */
		String i = "0";
		
		do {
			String p1 = JOptionPane.showInputDialog("Digite para acessar:\n1-Conta Corrente.\n2-Conta Poupança.\n3-Conta Rural");
			String p2 = "Digite para acessar:\n1-Depositar.\n2-Sacar.\n3-Verificar saldo.";
			
			switch(p1) {
			case "1" :
				JOptionPane.showInputDialog(p2);
			if (p2.equals("1")) {
				
			}
			
			}
			
		} while (i.equals("1"));
		
	}

}
