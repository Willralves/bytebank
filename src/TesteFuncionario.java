
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("William");
		func.setCpf("025.172.854-82");
		func.setSalario(5000.00);
		
		System.out.println(func.getBonificacao());
		

	}

}
