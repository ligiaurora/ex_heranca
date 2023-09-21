package Exercicio11;

public class Rei extends Peca {

	public Rei(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rei [getLinha()=");
		builder.append(getLinha());
		builder.append(", getColuna()=");
		builder.append(getColuna());
		builder.append(", isCor()=");
		builder.append(isCor());
		builder.append(", getMovimentos()=");
		builder.append(getMovimentos());
		builder.append("]");
		return builder.toString();
	}	
}
