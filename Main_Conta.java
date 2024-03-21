package BancoXYZ;

public class Main_Conta {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente() ;
		
		cliente1.agencia = 0001 ;
		cliente1.conta = 152493 ;
		cliente1.cpf = "493887338-69";
		cliente1.dataNascimento = "23/10/1999" ;
		cliente1.endereco = "Rua Ipomeias 59 - Vila Bela, São Paulo - SP" ;
		cliente1.nome = "Letícia Silva";
		cliente1.saldo = (float) 1458.99 ;
		cliente1.senha = "1234";
		cliente1.telefone = "1196551-3525" ;
		
		cliente1.mostrarCliente();
		
		System.out.println();
		
		contaCorrente conta152493 = new contaCorrente() ;
		
		conta152493.numero_doc_cc = 1569 ;
		conta152493.agencia_cc = 0001 ;
		conta152493.conta_cc = 152493 ;
		conta152493.valor_cc = 120 ;
		conta152493.tipo_cc = 1 ;
		conta152493.data_da_ocorrencia  = "19/03/2024" ;
		conta152493.saldo_cc = cliente1.saldo ;
		
		conta152493.DadosTransacao();
		conta152493.AtualizarSaldo();
		conta152493.RegistrarOcorrencia();
		
		
		
		
		

	}

}
