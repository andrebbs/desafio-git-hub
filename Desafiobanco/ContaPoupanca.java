public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
	
//	@Override
//	public void imprimirMenu(){
//		System.out.println("=== Menu Conta Poupan�a ===");
//		menu.exibeMenu();
//	}
	
}
