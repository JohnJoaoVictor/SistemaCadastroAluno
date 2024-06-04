package cadastro;

import java.util.ArrayList;

public class Aluno {
	double total;
	String nome, matricula, situacao = "reprovado";
	ArrayList<Double> notaAluno = new ArrayList<>();
	public Aluno() {
		
	}

	public Aluno(String nome, String matricula) {
		setNome(nome);
		setMatricula(matricula);
	}
	
	void insereNotas(double nota) {
		notaAluno.add(nota);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	void listar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		
		for(int i = 0; i < notaAluno.size(); i++) {
			System.out.println("Nota " + (i + 1)  + ": " + this.notaAluno.get(i));
		}
	}
	
	void mostrarSituacao() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nTotal: " + this.total);
		System.out.println("\nSituação: " + this.situacao);
	}
	
	void calculoNotas() {
		for (double notaLista:notaAluno) {
			 total = total + notaLista;
		}
		
		if(total >= 70) {
			this.situacao = "APROVADO";
		} else {
			this.situacao = "REPROVADO";
		}
	}

	public ArrayList<Double> getNotaAluno() {
		return notaAluno;
	}

	public void setNotaAluno(ArrayList<Double> notaAluno) {
		this.notaAluno = notaAluno;
	}
	
	
}
