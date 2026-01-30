package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Funcionario;

public class Teste {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>(); 
		
		int opcao;
		do {
			System.out.print("Digite a opção de cadastro: (aluno = 1/ funcionario = 2) ");
			opcao = Integer.parseInt(sc.next());
			
			switch (opcao) {
			case 1: 
				System.out.print("Digite o nome do Aluno: ");
				String nome = sc.nextLine();
				sc.nextLine();
				System.out.print("Digite a Data de Nascimento: ");
				Date dataDeNascimento = sft.parse(sc.next());
				System.out.print("Digite RG: ");
				String rg = sc.nextLine();
				sc.nextLine();
				System.out.print("Digite Data da Matricula: ");
				Date dataDaMatricula = sft.parse(sc.next());
				System.out.print("Digite RA do Aluno: ");
				String ra = sc.nextLine();
				sc.nextLine();
				
				alunos.add(new Aluno(dataDeNascimento, nome, rg, dataDaMatricula, ra));
				
				break;
			case 2:
				System.out.print("Digite nome do Funcionario: ");
				String nomeFuncionario = sc.nextLine();
				sc.nextLine();
				System.out.print("Digite data de Nascimento: ");
				Date dataNascimentoFuncionario =sft.parse(sc.next());
				System.out.print("Digite RG: ");
				String rgFuncionario = sc.nextLine();
				sc.nextLine();
				System.out.print("Digite data de Admissão: ");
				Date dataDeAdmissao = sft.parse(sc.next());
				System.out.print("Digite função: ");
				sc.nextLine();
				String funcao = sc.nextLine();
				System.out.print("Digite salario: ");
				double salario = sc.nextDouble();
				
				funcionarios.add(new Funcionario(dataNascimentoFuncionario, nomeFuncionario, rgFuncionario, dataDeAdmissao, funcao, salario));
				
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			
			default: System.out.println("Opção invalida. ");
			}
			
		}while(opcao != 3);
		sc.close();
	}

}
