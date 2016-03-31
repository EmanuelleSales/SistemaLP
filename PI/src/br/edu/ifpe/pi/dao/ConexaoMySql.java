package br.edu.ifpe.pi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.ifpe.pi.negocios.Aluno;

public class ConexaoMySql {
	
	private static ConexaoMySql mySelf = null;
	
	EntityManagerFactory factory;
	EntityManager gerenciadorEnt;
	
	private ConexaoMySql(){
		
		factory = Persistence.createEntityManagerFactory("sales");
		gerenciadorEnt = factory.createEntityManager();
		
	}
	
	public static ConexaoMySql getInstance(){
		
		if(mySelf == null){
			mySelf = new ConexaoMySql();
		}
		
		return mySelf;
	}
	
	public void salvar(Object o){
		
		gerenciadorEnt.getTransaction().begin();
		gerenciadorEnt.persist(o);
		gerenciadorEnt.getTransaction().commit();
		factory.close();
	}
	
	public void atualizar(Object o){
		
		gerenciadorEnt.getTransaction().begin();
		gerenciadorEnt.merge(o);
		gerenciadorEnt.getTransaction().commit();
		factory.close();
	}
	
	
	public void remover(Object o){
		
		gerenciadorEnt.getTransaction().begin();
		gerenciadorEnt.remove(o);
		gerenciadorEnt.getTransaction().commit();
		factory.close();
	}
	
	
	public Object buscar(int id){
		
		gerenciadorEnt.getTransaction().begin();
		Object o = gerenciadorEnt.find(Object.class, id);
		gerenciadorEnt.getTransaction().commit();
		factory.close();
	
		return o;
	}
	
	@SuppressWarnings("unchecked")
	public List listarTodos(String sql){
		List<Query> consultas;
		
		gerenciadorEnt.getTransaction().begin();
		Query consulta = gerenciadorEnt.createQuery(sql);
		consultas = consulta.getResultList();
		factory.close();
		
		return consultas;
	}
	
	
}
