package aplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;
import entities.Curso;
import services.CalculationMensalidadeService;


public class App {
	public static void main(String[] args) {
		CalculationMensalidadeService service = new CalculationMensalidadeService();
		List<Curso> cursos = new ArrayList<>();
		List<Aluno> alunos = new ArrayList<>();
		Integer op = 0;
		try (Scanner input = new Scanner(System.in)){
			do {
				System.out.println();
				menu();
				op = input.nextInt();
				System.out.println();
				
				switch (op) {
				case 1:
					System.out.print("Digite o codigo do curso: ");
					Integer codigo = input.nextInt();
					System.out.print("Digite o nome do curso: ");
					input.nextLine();
					String nome = input.nextLine();
					cursos.add(new Curso(codigo, nome));
					break;
				case 2:
					listarCursos(cursos);
					break;
				case 3:
					System.out.print("Digite o codigo do aluno: ");
					Integer codigoA = input.nextInt();
					System.out.print("Digite o nome do aluno: ");
					input.nextLine();
					String nomeA = input.nextLine();
					alunos.add(new Aluno(codigoA, nomeA));
					listarCursos(cursos);
					System.out.print("Escolha um curso para vincular a um aluno: ");
					Integer option = input.nextInt();
					
					for(Aluno aluno : alunos) {
						if(aluno.getCod() == codigoA) {
							switch(option) {
								case 1:
									vincularCursoAoAluno(cursos, service, aluno, 1);
									break;
								case 2:
									vincularCursoAoAluno(cursos, service, aluno, 2);
									break;
								case 3:
									vincularCursoAoAluno(cursos, service, aluno, 3);
									break;
								default:
									for(Curso curso : cursos)
										if(curso.getCod() > 3) service.calc(4, aluno, curso);
									break;
							}
						}
					}
					break;
				case 4:
					listarAlunos(alunos);
					break;
				default:
					System.out.println();
					System.out.println("Opcao invalida");
					System.out.println();
					break;
				}
			} while(op != 0);
		} catch (InputMismatchException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	public static void menu() {
		System.out.println("************* MENU *************");
		System.out.println("1 - adicionar cursos");
		System.out.println("2 - listar cursos");
		System.out.println("3 - adicionar alunos");
		System.out.println("4 - listar alunos");
		System.out.println();
		System.out.print("Escolha uma opcao: ");
	}
	
	public static void listarCursos(List<? extends Curso> list) {
		Integer i = 0;
		System.out.println();
		System.out.println("**************** TODOS OS CURSOS ****************");
		System.out.println();
		for(Curso item : list) {
			i++;
			System.out.printf("Curso #%d\n", i);
			System.out.printf("codigo : %d\n", item.getCod());
			System.out.printf("nome : %s\n", item.getNome());
			System.out.println();
		}
	}
	public static void listarAlunos(List<? extends Aluno> list) {
		Integer i = 0;
		System.out.println();
		System.out.println("**************** TODOS OS ALUNOS ****************");
		System.out.println();
		for(Aluno item : list) {
			i++;
			System.out.printf("Aluno #%d\n", i);
			System.out.printf("codigo : %d\n", item.getCod());
			System.out.printf("nome : %s\n", item.getNome());
			System.out.printf("nome do curso : %s\n", item.getC().getNome());
			System.out.printf("valor mensalidade : %.2f\n", item.getValorMensalidade());
			System.out.println();
		}
	}
	
	public static void vincularCursoAoAluno(List<Curso> cursos, CalculationMensalidadeService service, Aluno aluno, int option) {
		for(Curso curso : cursos) 
			if(curso.getCod() == option) service.calc(option, aluno, curso);
	}
}
