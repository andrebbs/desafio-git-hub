public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	
//	@Override
//	public void imprimirMenu(){
//		System.out.println("=== Menu Conta Poupança ===");
//		menu.exibeMenu();
//	}
	
}
