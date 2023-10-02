package Repository;

import java.util.List;

import Model.Pessoa;

public interface IRepositoryCRUD {
	
	public boolean atualiza(Pessoa pessoa);
	public boolean inseri(Pessoa pessoa);
	public boolean apaga(String identificador);
	public List<?> retornaLista();
}
