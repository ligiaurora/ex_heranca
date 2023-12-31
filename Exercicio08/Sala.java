package Exercicio08;

public class Sala extends Ambiente {
	private boolean tv;

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [tv=");
		builder.append(tv);
		builder.append(", getArea()=");
		builder.append(getArea());
		builder.append("]");
		return builder.toString();
	}
}
