package escola1;

import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("unused")

public class aluno extends Pessoa {
	Scanner scanner = new Scanner(System.in);

	public aluno(String nome, String cpf, Date data) {
		super(nome, cpf, data);

	}

	public String matricula;

	// public double tirarCopias(int qnt) {
	// return 0.07 * (double) qnt;
//	}

}
