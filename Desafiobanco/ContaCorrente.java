
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
//	@Override
//	public void imprimirMenu() {
//		menu.exibeMenu();
//	}
//	
//	public void submenu() {
//		System.out.println("=== Menu Conta Corrente ===");
//		menu.exibirSubMenu();
//		}
}