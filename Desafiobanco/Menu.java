import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	Scanner entrada = new Scanner(System.in);
	int xA;

	Cliente cliente1 = new Cliente();
	Conta cc = new ContaCorrente(cliente1);
	Conta cp = new ContaPoupanca(cliente1);

	public void iniciar() {
		int opcaoSub;

		do {
			exibeMenu();
			opcaoSub = entrada.nextInt();
			escolheOpcao(opcaoSub);
		} while (opcaoSub != 3);
	}

	private void exibeMenu() {
		System.out.print("##--Escolha a op��o desejada--##\n\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("| Op��o 1   Conta Corrente    |\n");
		System.out.print("| Op��o 2 - Conta Poupan�a    |\n");
		System.out.print("| Op��o 3 - Sair              |\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("Digite uma op��o: ");
	}

	private void escolheOpcao(int opcao) {
		switch (opcao) {
		case 1:
			cc = new ContaCorrente(cliente1);
			xA = opcao;
			iniciarSubMenu();
			break;
		case 2:
			cp = new ContaPoupanca(cliente1);
			xA = opcao;
			iniciarSubMenu();
			break;
		case 3:
			System.out.print("\nAt� logo!");
			break;
		default:
			System.out.print("\nOp��o Inv�lida!");
			break;
		}
	}

	// ***** submenu *****
	private void iniciarSubMenu() {
		int opcao;

		do {
			exibeSubMenu();
			opcao = entrada.nextInt();
			escolheOpcaoSubMenu(opcao);
		} while (opcao != 4);
	}

	public void exibeSubMenu() {
		System.out.print("##--Escolha a op��o desejada--##\n\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("| Op��o 1   Consultar Extrato |\n");
		System.out.print("| Op��o 2 - Sacar             |\n");
		System.out.print("| Op��o 3 - Depositar         |\n");
		System.out.print("| Op��o 4 - Voltar Menu       |\n");
		System.out.print("|-----------------------------|\n");
		System.out.print("Digite uma op��o: ");
	}

	private void escolheOpcaoSubMenu(int subOpcao) {
		cliente1.setNome("Andr�");
		double valor;

		switch (subOpcao) {
		case 1:
			if (xA == 1) {
				cc.imprimirExtrato();
			} else {
				cp.imprimirExtrato();
			}
			break;
		case 2:
			System.out.print("\n Quanto deseja Sacar: ");
			valor = entrada.nextDouble();
			if (xA == 1) {
				cc.sacar(valor);
			} else {
				cp.sacar(valor);
			}

			break;
		case 3:
			System.out.print("\n Quanto deseja depositar: ");
			valor = entrada.nextDouble();
			if (xA == 1) {
				cc.depositar(valor);
			} else {
				cp.depositar(valor);
			}
			break;
		case 4:
			System.out.print("\nMenu Principal! \n\n");
			break;
		default:
			System.out.print("\nOp��o Inv�lida!");
			break;
		}
	}

}
