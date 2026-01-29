package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa{
	
	private Date dataDeAdmissao;
	private String funcao;
	private Double salario;
	
	private static final SimpleDateFormat  dtf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Funcionario(Date dataDeNascimento, String nome, String rg, Date dataDeAdmissao, String funcao,
			Double salario) {
		super(dataDeNascimento, nome, rg);
		this.dataDeAdmissao = dataDeAdmissao;
		this.funcao = funcao;
		this.salario = salario;
	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return dtf.format(dataDeAdmissao);
	}
	
}
