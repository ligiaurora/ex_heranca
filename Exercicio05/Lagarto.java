package Exercicio05;

public class Lagarto extends Reptil {
	private boolean soltaCauda;

	public boolean isSoltaCauda() {
		return soltaCauda;
	}

	public void setSoltaCauda(boolean soltaCauda) {
		this.soltaCauda = soltaCauda;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [soltaCauda=");
		builder.append(soltaCauda);
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
		builder.append(", getIdade()=");
		builder.append(getIdade());
		builder.append("]");
		return builder.toString();
	}
}
