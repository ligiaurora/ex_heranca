package Exercicio11;

public class Torre extends Peca {

	public Torre(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public boolean mover(int novaLinha, int novaColuna) {
        if (novaLinha == getLinha() || novaColuna == getColuna()) {
            setLinha(novaLinha);
            setColuna(novaColuna);
            System.out.println("Torre movida para a posição (" + getLinha() + ", " + getColuna() + ")");
            return true;
        } else {
            System.out.println("Movimento inválido para a Torre.");
            return false;
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Torre [getLinha()=");
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
