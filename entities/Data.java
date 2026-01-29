package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	private Date data;
	
	private static final SimpleDateFormat  dtf = new SimpleDateFormat("dd/MM/yyyy");

	public Data(Date data) {
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data: " + "("+ dtf.format(data) + ")";
	}
	
	

}
