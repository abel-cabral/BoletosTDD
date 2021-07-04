import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
	private Date data;
	private Double total;
	private String nomeCliente;	
			
	public Fatura(String data, Double total, String nomeCliente) {
		this.setData(data);
		this.total = total;
		this.nomeCliente = nomeCliente;
	}
	
	public String getData() {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		return sp.format(data);
	}

	public void setData(String data) {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.data = sp.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}
