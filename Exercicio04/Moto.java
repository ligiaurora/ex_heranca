package Exercicio04;

public class Moto extends Veiculo{
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append(", isMotor()=");
		builder.append(isMotor());
		builder.append("]");
		return builder.toString();
	}
}
