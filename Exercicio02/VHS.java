package Exercicio02;

public class VHS extends Midia {
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getDuracao()=");
		builder.append(getDuracao());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
		builder.append("]");
		return builder.toString();
	}
}
