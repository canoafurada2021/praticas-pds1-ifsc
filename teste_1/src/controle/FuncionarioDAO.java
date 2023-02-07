package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDAO {

	
	private static ArrayList<Funcionario> listaFuncionarios;
	
	
	
	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList<>();
	}
	
	public boolean inserir(Funcionario func) {
		listaFuncionarios.add(func);
		
		return false;
	}
	
	public ArrayList<Funcionario> listar(){
		return this.listaFuncionarios;
	}
	
}
