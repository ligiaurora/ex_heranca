package Exercicio05;

public class Cao extends Mamifero {
	private String raca;
	private boolean estaBuscandoBola;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
    public void iniciarBuscaBola() {
        estaBuscandoBola = true;
    }

    public void pararBuscaBola() {
        estaBuscandoBola = false;
    }
    
    public void buscarBola() {
        if (estaBuscandoBola) {
            System.out.println(getNome() + " está buscando uma bola.");
        } else {
            System.out.println(getNome() + " não está buscando uma bola.");
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [raca=");
		builder.append(raca);
		builder.append(", estaBuscandoBola=");
		builder.append(estaBuscandoBola);
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
		builder.append("]");
		return builder.toString();
	}
}
