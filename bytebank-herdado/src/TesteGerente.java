
public class TesteGerente {

	public static void main(String[] args) {
		
		
		Autenticavel ref = new Gerente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Reinaldo Vicente");
		g1.setCpf("214.453.234.12");
		g1.setSalario(5000);
		g1.setCargo("Gerente T.I");

		g1.setSenha(2255); // inserindo senha para Gerente

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCargo());

//		g1.setLogin("reinaldo.couto");
		g1.setSenha(2255);

	
		System.out.println(g1.getBonificacao()); // mostrando bonificação

	}

}