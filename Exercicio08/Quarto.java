package Exercicio08;

public class Quarto extends Ambiente {
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append(", getArea()=");
		builder.append(getArea());
		builder.append("]");
		return builder.toString();
	}
}
