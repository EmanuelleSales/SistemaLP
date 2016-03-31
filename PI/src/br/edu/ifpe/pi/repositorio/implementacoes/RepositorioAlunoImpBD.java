package br.edu.ifpe.pi.repositorio.implementacoes;

import java.util.List;

import br.edu.ifpe.pi.dao.ConexaoMySql;
import br.edu.ifpe.pi.negocios.Aluno;
import br.edu.ifpe.pi.repositorio.interfaces.RepositorioGenerico;

public class RepositorioAlunoImpBD implements RepositorioGenerico<Aluno> {
	
	public void salvar(Aluno aluno){
		
		ConexaoMySql.getInstance().salvar(aluno);
	}
	
	public void atualizar(Aluno aluno){
	
		ConexaoMySql.getInstance().atualizar(aluno);
	}
	
	
	public void remover(Aluno aluno){
	
		ConexaoMySql.getInstance().remover(aluno);
	
	}
	
	
	public Aluno buscar(int id){
	//
		return (Aluno) ConexaoMySql.getInstance().buscar(id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> listarTodos(){
		
		List<Aluno> alunos = ConexaoMySql.getInstance().listarTodos("select aluno from Aluno aluno");
		
		return alunos;
	}
	
}
