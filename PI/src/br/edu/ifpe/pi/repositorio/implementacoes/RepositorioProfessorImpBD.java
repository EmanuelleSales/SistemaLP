package br.edu.ifpe.pi.repositorio.implementacoes;

import java.util.List;

import br.edu.ifpe.pi.dao.ConexaoMySql;
import br.edu.ifpe.pi.negocios.Professor;
import br.edu.ifpe.pi.repositorio.interfaces.RepositorioGenerico;

public class RepositorioProfessorImpBD implements RepositorioGenerico<Professor> {

public void salvar(Professor professor){
		
		ConexaoMySql.getInstance().salvar(professor);
	}
	
	public void atualizar(Professor professor){
	
		ConexaoMySql.getInstance().atualizar(professor);
	}
	
	
	public void remover(Professor professor){
	
		ConexaoMySql.getInstance().remover(professor);
	
	}
	
	
	public Professor buscar(int id){
	//
		return (Professor) ConexaoMySql.getInstance().buscar(id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Professor> listarTodos(){
		
		List<Professor> professores = ConexaoMySql.getInstance().listarTodos("select professor from Professor professor");
		
		return professores;
	}
}
