package Exercicio09;

public class Apolo11 extends NaveEspacial{
	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", getVelocidadeMaxima()=");
		builder.append(getVelocidadeMaxima());
		builder.append("]");
		return builder.toString();
	}
}
