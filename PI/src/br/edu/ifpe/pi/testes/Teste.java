package br.edu.ifpe.pi.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.pi.negocios.Aluno;
import br.edu.ifpe.pi.negocios.Professor;
import br.edu.ifpe.pi.repositorio.implementacoes.RepositorioAlunoImpBD;
import br.edu.ifpe.pi.repositorio.implementacoes.RepositorioProfessorImpBD;

public class Teste {
	
	public static void main(String[] args) {
	
		
		Aluno aluno = new Aluno("2134","Msna");
		Professor p = new Professor("ramon");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(aluno);
		System.out.println(aluno.getNome());
		
		p.setAlunos(alunos);
		
		RepositorioProfessorImpBD ep = new RepositorioProfessorImpBD();
		
		ep.salvar(p);
		
		RepositorioAlunoImpBD ar = new RepositorioAlunoImpBD();
		
		ar.salvar(aluno);
		
		
		
	}

}
