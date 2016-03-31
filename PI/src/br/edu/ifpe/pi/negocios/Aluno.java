package br.edu.ifpe.pi.negocios;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String matricula;
	@Column
	private String nome;
	@ManyToOne
	@JoinColumn(name="professor_id") 
	private Professor professor;

	public Aluno(String matricula, String nome){
		this.matricula = matricula;
		this.nome = nome;
	}
	
	@Deprecated
	public Aluno(){
		
	}
	
	public int getId() {
		return id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setProfessor(Professor professor){
		this.professor= professor ;
	}
	
	public Professor getProfessor(){
		return professor;
	}
	
	
}

