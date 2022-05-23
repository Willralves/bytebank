
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		Funcionario funcionario1 = new Funcionario();
		ControlaBonificacao controla = new ControlaBonificacao();
		
		gerente1.setNome("William");
		gerente1.setSalario(7500.00);
		

		funcionario1.setNome("William");
		funcionario1.setSalario(7500.00);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getSalario());
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
		
		
		gerente1.setSenha(552216);
		boolean autenticou = gerente1.autentica(552216);
		
		System.out.println(autenticou);
		
		System.out.println(gerente1.getBonificacao());
		System.out.println(funcionario1.getBonificacao());
		
		System.out.println(controla.registra(gerente1));
		
		
		System.out.println(controla.registra(funcionario1));
	
		
	}

}
