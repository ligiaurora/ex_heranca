package Exercicio04;

public class Caminhao extends Veiculo {
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caminhao [eixos=");
		builder.append(eixos);
		builder.append(", isMotor()=");
		builder.append(isMotor());
		builder.append("]");
		return builder.toString();
	}
}
