package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa{
	
	private Date dataDeMAtricula;
	private String ra;
	
	private static final SimpleDateFormat  dtf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Aluno(Date dataDeNascimento, String nome, String rg, Date dataDeMAtricula, String ra) {
		super(dataDeNascimento, nome, rg);
		this.dataDeMAtricula = dataDeMAtricula;
		this.ra = ra;
	}

	public Date getDataDeMAtricula() {
		return dataDeMAtricula;
	}

	public void setDataDeMAtricula(Date dataDeMAtricula) {
		this.dataDeMAtricula = dataDeMAtricula;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
	public String toString() {
		return dtf.format(dataDeMAtricula);
	}

	
}
