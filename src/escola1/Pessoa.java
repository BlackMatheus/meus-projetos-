package escola1;

import java.util.Date;

public class Pessoa {

	public static String nome;
	public String cpf;
	public Date dataNascimento;

	public Pessoa(String nome, String cpf, Date data) {

		Pessoa.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = data;

	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
