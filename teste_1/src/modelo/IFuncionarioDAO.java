package modelo;

import java.util.ArrayList;

public interface IFuncionarioDAO {

public boolean inserir(Funcionario f);

public boolean alterar(Funcionario f, Long cpf);

public boolean deletar(Funcionario f, Long cpf);

public ArrayList<Funcionario> listarFuncionarios();
}
