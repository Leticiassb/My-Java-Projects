package BancoXYZ;

public class cliente {
	
	int agencia ;
	int conta ;
	String cpf ;
	String nome ;
	String dataNascimento ;
	String endereco ;
	String telefone ;
	float saldo ;
	String senha ;
	
	public void mostrarCliente() {
		System.out.println("--DADOS DO CLIENTE--");
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("Saldo: R$" + saldo);
		System.out.println("Senha: " + senha);
	}
	

}
