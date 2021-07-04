import java.util.Date;

public class Boleto {
	private Date data;
	private String codigoBoleto;
	private Double valorPago;
	
	public Boleto() { }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCodigoBoleto() {
		return codigoBoleto;
	}

	public void setCodigoBoleto(String codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
}
