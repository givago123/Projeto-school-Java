package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa{
	
	private Date dataDeNascimento;
	private String nome;
	private String rg;
	
	private static final SimpleDateFormat  dtf = new SimpleDateFormat("dd/MM/yyyy");

	public Pessoa(Date dataDeNascimento, String nome, String rg) {
		super();
		this.dataDeNascimento = dataDeNascimento;
		this.nome = nome;
		this.rg = rg;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return dtf.format(dataDeNascimento);
	}
	
}
