import java.util.Date;

public class Fatura {
	private Date data;
	private Double total;
	private String nomeCliente;
			
	public Fatura(Date data, Double total, String nomeCliente) {
		this.data = data;
		this.total = total;
		this.nomeCliente = nomeCliente;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
