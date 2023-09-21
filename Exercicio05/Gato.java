package Exercicio05;

public class Gato extends Mamifero {
	private String personalidade;
	private boolean estaDormindo;

	public String getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}
	
	public void iniciarSoneca() {
		estaDormindo = true;
    }

    public void pararBuscaBola() {
    	estaDormindo = false;
    }
    
    public void Dormindo() {
        if (estaDormindo) {
            System.out.println(getNome() + " está dormindo no momento.");
        } else {
            System.out.println(getNome() + " não está dormindo.");
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [personalidade=");
		builder.append(personalidade);
		builder.append(", estaDormindo=");
		builder.append(estaDormindo);
		builder.append(", getTipoPelo()=");
		builder.append(getTipoPelo());
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
