import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Boleto {
	private Date data;
	private String codigoBoleto;
	private Double valorPago;
	
	public Boleto(String data, String codigoBoleto, Double valorPago) {
		this.setData(data);
		this.codigoBoleto = codigoBoleto;
		this.valorPago = valorPago;
	}

	public Date getData() {
		return data;
	}

	public void setData(String data) {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.data = sp.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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
