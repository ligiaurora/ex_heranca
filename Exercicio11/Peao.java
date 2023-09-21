package Exercicio11;

public class Peao extends Peca {

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);	
	}
	
	public boolean mover(int novaLinha, int novaColuna) {
        if (novaLinha == this.getLinha() + 1 && novaColuna == getColuna()) {
            setLinha(novaLinha);
            setColuna(novaColuna);
            System.out.println("Peão movido para a linha " + getLinha() + " e coluna " + getColuna());
            return true;
        } else {
            System.out.println("Movimento inválido para o peão.");
            return false;
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peao [getLinha()=");
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
