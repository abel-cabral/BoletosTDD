import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ProcessadorBoletosTest {
	@Test
	void fatura01() {					
		Set<Boleto> pagamentos = new HashSet<>();
		pagamentos.add(new Boleto("25/01/2021", "5646521564564", 500.00));
		pagamentos.add(new Boleto("25/02/2021", "8654654564564", 400.00));
		pagamentos.add(new Boleto("25/03/2021", "7234677464548", 600.00));
		
		Fatura fatura = new Fatura("25/04/2021", 1500.00, "Lucas Luco");
				
		double total = 0;				
		for (Boleto boleto : pagamentos) {
			total += boleto.getValorPago();
		}
		
		if(total >= fatura.getTotal()) {
			fatura.setStatus = "PAGA";
			Set<Fatura> pagamentosFaturas = new HashSet<>();			
			pagamentos.forEach(p -> pagamentosFaturas.add(new Fatura(p.getData().toString(), p.getValorPago(), fatura.getNomeCliente())));			
		}		
		System.out.println(total);
	}

	@Test
	void fatura02() {
		Set<Boleto> pagamentos = new HashSet<>();
		pagamentos.add(new Boleto("25/01/2021", "5646521564564", 1000.00));
		pagamentos.add(new Boleto("25/02/2021", "8654654564564", 500.00));
		pagamentos.add(new Boleto("25/03/2021", "7234677464548", 250.00));

		Fatura fatura = new Fatura("25/04/2021", 1500.00, "Lucas Luco");

		double total = 0;
		for (Boleto boleto : pagamentos) {
			total += boleto.getValorPago();
		}

		if (total >= fatura.getTotal()) {
			fatura.setStatus = "PAGA";
			Set<Fatura> pagamentosFaturas = new HashSet<>();			
			pagamentos.forEach(p -> pagamentosFaturas.add(new Fatura(p.getData().toString(), p.getValorPago(), fatura.getNomeCliente())));
		}
		System.out.println(total);
	}

	@Test
	void fatura03() {
		Set<Boleto> pagamentos = new HashSet<>();
		pagamentos.add(new Boleto("25/01/2021", "5646521564564", 500.00));
		pagamentos.add(new Boleto("25/02/2021", "8654654564564", 400.00));

		Fatura fatura = new Fatura("25/04/2021", 2000.00, "Lucas Luco");

		double total = 0;
		for (Boleto boleto : pagamentos) {
			total += boleto.getValorPago();
		}

		if (total >= fatura.getTotal()) {
			fatura.setStatus = "PAGA";
		} else {
			Set<Boleto> pagamentosBoletos = new HashSet<>();			
			pagamentos.forEach(p -> pagamentosBoletos.add(p));
		}

		System.out.println(total);
	}

}
