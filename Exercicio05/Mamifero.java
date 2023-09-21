package Exercicio05;

public class Mamifero extends Animal {
	private String tipoPelo;
	
	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}

	public void amamentar() {
        System.out.println(getNome() + " está amamentando seus filhotes.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [tipoPelo=");
		builder.append(tipoPelo);
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
