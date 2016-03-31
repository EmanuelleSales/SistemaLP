package br.edu.ifpe.pi.repositorio.interfaces;

import java.util.List;

public interface RepositorioGenerico <Generico>{

	public void salvar(Generico generico);
	public void atualizar(Generico generico);
	public void remover(Generico generico);
	public Generico buscar(int id);
	public List<Generico> listarTodos();
}
