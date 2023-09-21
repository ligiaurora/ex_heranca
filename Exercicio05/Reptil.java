package Exercicio05;

public class Reptil extends Animal{
	private String tipoEscama;
	private boolean estaRegulandoTemperatura;

	public String getTipoEscama() {
		return tipoEscama;
	}

	public void setTipoEscama(String tipoEscama) {
		this.tipoEscama = tipoEscama;
	}
	
	
	public void iniciarRegulagem() {
		estaRegulandoTemperatura = true;
    }

    public void pararRegulagem() {
    	estaRegulandoTemperatura = false;
    }
    
    public void regularTemperatura() {
        if (estaRegulandoTemperatura) {
            System.out.println(getNome() + " regulando sua temperatura corporal.");
        } else {
            System.out.println(getNome() + " não está regulando sua temperatura corporal.");
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [tipoEscama=");
		builder.append(tipoEscama);
		builder.append(", estaRegulandoTemperatura=");
		builder.append(estaRegulandoTemperatura);
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
