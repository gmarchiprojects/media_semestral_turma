import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class sistema_media_semestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definição ArralyLists
		List <Double> mediaAlunos = new ArrayList<>();
		List <String> resultadoAlunos = new ArrayList<>();
		
		//Definição variaveis dos alunos para médias
		
		int alunosAprovados = 0, alunosReprovados = 0 , alunosAF = 0;
		
		//Scanner + Decimal Formater
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.0");
		
		double notaProva, notaProjeto, notaLista, resultado, mediaMaior, mediaMenor;
		int pesoProva = 5, pesoProjeto = 3, pesoLista = 2;	
		
		//Captura total de Alunos e Nome do Usuario do Sistema
		
		System.out.print("Qual o seu nome?");
		String user = sc.nextLine();
		System.out.println("Olá Sr(a). "+user+" Seja bem vindo ao sistema de notas do Colégio HSM");
		System.out.print("Quantos alunos existem na sala?");
		int totalAlunos = sc.nextInt();
		
		//Captura das notas
		
			for(int i = 1; i <= totalAlunos; i++) {
				
					System.out.print("Digite a nota da prova do aluno: ");
					notaProva = sc.nextDouble();
					System.out.print("Digite a nota do Projeto do aluno: ");
					notaProjeto = sc.nextDouble();
					System.out.print("Digite a nota da Lista de Exercícios do aluno: ");
					notaLista = sc.nextDouble();
					
					resultado = ((notaProva * pesoProva)+(notaProjeto * pesoProjeto)+(notaLista * pesoLista))/((pesoProva + pesoProjeto + pesoLista));
					mediaAlunos.add(resultado);

					if (resultado < 5) {
						System.out.println("Resultado: Reprovado");
						resultadoAlunos.add("Reprovado");
						alunosReprovados += 1;
					}else if (resultado <= 7.9) {
						System.out.println("Resultado: Avaliação Final");
						resultadoAlunos.add("Avaliação Final");
						alunosAF += 1;
					}else {
						System.out.println("Resultado: Aprovado");
						resultadoAlunos.add("Aprovado");
						alunosAprovados += 1;	
						}	
	
				}
			//Print das notas , maior e menor da turma	
			
			mediaMaior = Collections.max(mediaAlunos);
			mediaMenor = Collections.min(mediaAlunos);
			
			
		System.out.println("A maior nota da turma foi: "+formatter.format(mediaMaior));
		System.out.println("A menor nota da turma foi: "+formatter.format(mediaMenor));	
					
		 // Descobrir média das notas
		double mediaTurma;
		double mediaSomas = 0;
		
		for (double notasFinais : mediaAlunos) {
			mediaSomas += notasFinais;
		}
		
		mediaTurma = mediaSomas / totalAlunos;
		System.out.println("A média de notas da turma foi: "+formatter.format(mediaTurma));
		System.out.println("A quantidade de alunos aprovados foi: "+alunosAprovados);
		System.out.println("A quantidade de alunos reprovados foi: "+alunosReprovados);
		System.out.println("A quantidade de alunos que terão de fazer a Avaliação Final foi: "+alunosAF);
		
		sc.close();
			}

		}


		

	
	
