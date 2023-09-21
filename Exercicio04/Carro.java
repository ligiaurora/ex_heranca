package Exercicio04;

public class Carro extends Veiculo {
	private int portas;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append(", isMotor()=");
		builder.append(isMotor());
		builder.append("]");
		return builder.toString();
	}
}
