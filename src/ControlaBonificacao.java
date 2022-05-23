
public class ControlaBonificacao {

	double salarioTotal;
	
	public Double registra (Funcionario funcionario) {
		
		salarioTotal = (funcionario.getSalario()) + (funcionario.getBonificacao());
		return getSalarioTotal();
	}
	
	public double getSalarioTotal() {
		return salarioTotal;
	}
	
	
}
