package BancoXYZ;

public class contaCorrente {
	
	int numero_doc_cc;
	int agencia_cc ;
	int conta_cc;
	float valor_cc;
	double tipo_cc;
	String data_da_ocorrencia ;
	float saldo_cc;
	
	
	
	public void DadosTransacao() {
		System.out.println("--CONTA CORRENTE--");
		System.out.println("Número documento: " + numero_doc_cc);
		System.out.println("Agência: " + agencia_cc);
		System.out.println("Conta: " + conta_cc);
		System.out.println("Valor: R$" + valor_cc);
		
		if (tipo_cc == 1) { 			
		System.out.println("Tipo: " + tipo_cc + "(Depósito)");
		} else
		System.out.println("Tipo: " + tipo_cc + " (Saque)");
	
		
	}
	
	
	
	public void AtualizarSaldo() {
		System.out.println("O saldo atual da conta é R$" + (saldo_cc + valor_cc));
	}
	
	public void RegistrarOcorrencia() {
		System.out.println("Movimentação realizada na data " + data_da_ocorrencia);
	}

}
