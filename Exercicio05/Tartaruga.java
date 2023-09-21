package Exercicio05;

public class Tartaruga extends Reptil {
	private String tamanhoCasco;

	public String getTamanhoCasco() {
		return tamanhoCasco;
	}

	public void setTamanhoCasco(String tamanhoCasco) {
		this.tamanhoCasco = tamanhoCasco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [tamanhoCasco=");
		builder.append(tamanhoCasco);
		builder.append(", getTipoEscama()=");
		builder.append(getTipoEscama());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getCor()=");
		builder.append(getCor());
		builder.append(", getTamanho()=");
		builder.append(getTamanho());
		builder.append("]");
		return builder.toString();
	}
}
