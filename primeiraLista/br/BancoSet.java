package primeiraLista.br;

public interface BancoSet {
	public boolean saldo(String banco);
	public int depositar(String banco);
	public int sacar(String banco);
	public boolean atualizar(String banco);
	
}
