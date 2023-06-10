package escola1;

import java.util.Date;
import java.util.Scanner;

public class escola1Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome do aluno: ");
		String nomeAluno = scanner.next();

		System.out.println("Informe o CPF do aluno: ");
		String cpfAluno = scanner.next();

		System.out.println("Informe a matrícula do aluno: ");
		String matriculaAluno = scanner.next();

		System.out.println("Informe o nome do professor:");
		String nomeProfessor = scanner.next();

		System.out.println("Informe o CPF do professor:");
		String numeroCpf = scanner.next();

		System.out.println("Informe o salario do professor:");
		double salarioProfessor = scanner.nextDouble();

		System.out.println("Informe a diciplina do professor:");
		String dcpProfessor = scanner.next();

		System.out.println("Informe o nome do funcionario:");
		String nomeFuncionario = scanner.next();

		System.out.println("Informe o cpf do funcionario:");
		String FuncionarioCpf = scanner.next();

		System.out.println("Informe o salario do funcionario:");
		double salarioFuncionario = scanner.nextDouble();

		System.out.println("Informe o cargo do funcionario:");
		String cargoFuncionario = scanner.next();

		aluno a = new aluno(nomeAluno, cpfAluno, new Date());
		a.matricula = matriculaAluno;
		System.out.println("------------------------------------------------------------------");
		System.out.println("veja como os atributos foram preenchidos para o ALUNO:");
		System.out.println("Nome do Aluno: " + Pessoa.nome);
		System.out.println("CPF do Aluno:" + a.cpf);
		System.out.println("numero da matricula: " + a.matricula);
		System.out.println("data de nascimento" + a.dataNascimento.toString());
		System.out.println("-----------------------------------------------------------");

		professor p = new professor(nomeProfessor, numeroCpf, new Date());
		p.salario = salarioProfessor;
		p.diciplina = dcpProfessor;
		;
		System.out.println("veja como os atributos foram preenchidos para o professo: ");
		System.out.println("Nome do Professor: " + Pessoa.nome);
		System.out.println("CPF do Professor:" + p.cpf);
		System.out.println("o salario do Professor:" + p.salario);
		System.out.println("diciplina do Professor:" + p.diciplina);
		System.out.println("data de nascimento" + p.dataNascimento.toString());
		System.out.println("-----------------------------------------------------------");

		funcionario f = new funcionario(nomeFuncionario, FuncionarioCpf, new Date());
		f.salario = salarioFuncionario;
		f.cargo = cargoFuncionario;
		;
		System.out.println("veja como os atributos foram preenchidos para o FUNCIONARIO:");
		System.out.println("Nome: " + Pessoa.nome);
		System.out.println("CPF:" + f.cpf);
		System.out.println("salario:" + f.salario);
		System.out.println("cargo:" + f.cargo);
		System.out.println("data de nascimento" + f.dataNascimento.toString());
		System.out.println("-----------------------------------------------------------");

		// TODO Auto-generated method stub
	}
}
