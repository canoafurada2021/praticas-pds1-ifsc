package controle;

import java.util.ArrayList;

import modelo.Funcionario;
import modelo.IFuncionarioDAO;

public class FuncionarioDAO implements IFuncionarioDAO {

	private static ArrayList<Funcionario> listaFuncionarios;
	private static FuncionarioDAO instancia;

	public static FuncionarioDAO getInstance() {
		if (instancia == null) {
			instancia = new FuncionarioDAO();
			listaFuncionarios = new ArrayList<>();
		}
		return instancia;
	}

	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList<>();
	}

	public boolean inserir(Funcionario func) {
		if (func != null) {
			listaFuncionarios.add(func);
			return true;
		}

		return false;
	}

	public ArrayList<Funcionario> listar() {
		return this.listaFuncionarios;
	}

	@Override
	public boolean alterar(Funcionario f, Long cpf) {
		for (Funcionario func : listaFuncionarios) {
			if (func.getCpf().equals(cpf)) {
				func.setCpf(f.getCpf());
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deletar(Funcionario f, Long cpf) {
for(Funcionario func : listaFuncionarios) {
	if(func.getCpf().equals(cpf)) {
		listaFuncionarios.remove(func);
		return true;
	}
}
		
		return false;
	}

	@Override
	public ArrayList<Funcionario> listarFuncionarios() {

		//pendente
		return null;
	}

}
