package cadastro;

import java.util.ArrayList;

public class Sala {
	ArrayList<Aluno> listaCalouros;
	
    public Sala() {
    	this.listaCalouros = new ArrayList<>(); 
    }
    
    void inserirAluno(Aluno novoAluno) {
    	novoAluno.calculoNotas();
    	listaCalouros.add(novoAluno);
    }
    
    void listarAlunos() {
    	System.out.println("\nLista de Alunos");
    	
    	for(Aluno alunoNaLista:listaCalouros) {
    		alunoNaLista.listar();
    	}
    	
    }
    
    void listarSituacoes() {
    	System.out.println("Situações");
    	
    	for (Aluno alunoNaLista:listaCalouros) {
    		 alunoNaLista.mostrarSituacao();
    	}
    }
}
 