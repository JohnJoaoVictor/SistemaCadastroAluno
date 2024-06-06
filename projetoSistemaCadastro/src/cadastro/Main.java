package cadastro;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcao, qntdNotas; //variavel int
		String nome, matricula; //variavel strings
		Aluno alunoCalouro = new Aluno(); //atribuindo a classe Aluno
		Sala novaSala = new Sala();
		double nota = 0; //variavel double
		
		//SCANNER ESCOLHA
		Locale.setDefault(Locale.US);
		Scanner escolha = new Scanner(System.in);
		
		//SISTEMA DE CADASTRO DO ALUNO

		do {
			System.out.println("\n----------------"); // opções que o usuario escolherá
			System.out.println("    MENU");
			System.out.println("Escolha um opção:");
			System.out.println("1 - Inserir Aluno");
			System.out.println("2 - Listar Aluno");
			System.out.println("3 - Situações");
			System.out.println("0 - Sair");

			opcao = escolha.nextInt();
			
			escolha.nextLine();
			
			switch(opcao) {
			
			   case 1: //INSERIR ALUNO
				  System.out.print("\nInforme seu Nome: ");
				   nome = escolha.nextLine();
				  System.out.print("\nInforme sua Matrícula: ");
				   matricula = escolha.nextLine();
				   
				  alunoCalouro = new Aluno(nome, matricula);
				   
				  System.out.println("\nQuantas notas você quer?");
				  qntdNotas = escolha.nextInt();
				  
				  for (int i = 0; i < qntdNotas; i++) {
					  System.out.println("\nNota: " + (i + 1) );
					   nota = escolha.nextDouble();
					   alunoCalouro.insereNotas(nota);
				  }
				  
				  novaSala.inserirAluno(alunoCalouro);
				break;
			   case 2: //LISTAR ALUNO
				   novaSala.listarAlunos();
				break;
			   case 3: //SITUAÇÕES
				   novaSala.listarSituacoes();
				break;
			   default:
				System.out.println("Sessão Finalizada");
			}
			
		} while (opcao != 0);
		escolha.close();
	} 

}
