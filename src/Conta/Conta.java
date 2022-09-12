package Conta;



public abstract class Conta {
	protected String nome;
	protected String cpf;
	protected String senha;
	protected double saldo;
	
	public Conta() {	
	}
	public Conta(String nome, String cpf, String senha, double saldo) {	
		 super();
		 this.nome = nome;
		 this.cpf = cpf;
		 this.senha = senha;
		 this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String Sacar(double valor) {
		if (this.saldo < valor) {
			return "Saldo Insuficiente";
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return "Saque Efetuado";
			
		}
	}
		
	public void Deposito(double deposito) {
		this.saldo = saldo + deposito;
	}
	
	public void Tranferir(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
		} else {
			System.out.println("Não há saldo suficiente para transferência");
		}
	}
	
	
	@Override
	public String toString() {
		return "[Nome = " + nome + ", CPF = " + cpf + ", Saldo = " + saldo + "]";
	}
	
	
}
