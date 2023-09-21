package Exercicio03;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca = 0.0;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
	     if (valor > 0) {
	            saldoPoupanca += valor;
	            return true;
	      } else {
	            return false;
	      }
	 }

	 public boolean saquePoupanca(double valor) {
	      if (valor > 0 && saldoPoupanca >= valor) {
	            saldoPoupanca -= valor;
	            return true;
	        } else {
	            return false;
	        }
	    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroconta()=");
		builder.append(getNumeroconta());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append("]");
		return builder.toString();
	}	 
}
